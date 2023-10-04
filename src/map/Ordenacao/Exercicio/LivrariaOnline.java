package map.Ordenacao.Exercicio;

import java.util.*;

public class LivrariaOnline {
    private Map<String, Livro> livros;

    public LivrariaOnline() {
        this.livros = new HashMap<>();
    }

    public void adicionarLivro(String link, String titulo, String autor, double preco) {
        livros.put(link, new Livro(titulo, autor, preco));
    }

    public void removerLivro(String titulo) {
        // Verifica se o livro existe no mapa antes de remover
        if (livros.containsKey(titulo)) {
            livros.remove(titulo);
        }
    }

    public void exibirLivrosOrdenadosPorPreco() {
        List<Livro> listaOrdenada = new ArrayList<>(livros.values());
        listaOrdenada.sort(Comparator.comparingDouble(Livro::getPreco));
        for (Livro livro : listaOrdenada) {
            System.out.println(livro);
        }
    }

    public List<Livro> pesquisarLivrosPorAutor(String autor) {
        List<Livro> livrosDoAutor = new ArrayList<>();

        for (Livro livro : livros.values()) {
            if (livro.getAutor().equalsIgnoreCase(autor)) {
                livrosDoAutor.add(livro);
            }
        }

        return livrosDoAutor;
    }

    public Livro obterLivroMaisCaro() {
        Livro livroMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;

        for (Livro livro : livros.values()) {
            if (livro.getPreco() > maiorPreco) {
                livroMaisCaro = livro;
                maiorPreco = livro.getPreco();
            }
        }

        return livroMaisCaro;
    }

    public Livro exibirLivroMaisBarato() {
        Livro livroMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;

        for (Livro livro : livros.values()) {
            if (livro.getPreco() < menorPreco) {
                livroMaisBarato = livro;
                menorPreco = livro.getPreco();
            }
        }

        return livroMaisBarato;
    }
    public static void main(String[] args) {
        LivrariaOnline livrariaOnline = new LivrariaOnline();
        // Adiciona os livros à livraria online
        livrariaOnline.adicionarLivro("https://amzn.to/3EclT8Z", "1984", "George Orwell", 50d);
        livrariaOnline.adicionarLivro("https://amzn.to/47Umiun", "A Revolução dos Bichos", "George Orwell", 7.05d);
        livrariaOnline.adicionarLivro("https://amzn.to/3L1FFI6", "Caixa de Pássaros - Bird Box: Não Abra os Olhos", "Josh Malerman", 19.99d);
        livrariaOnline.adicionarLivro("https://amzn.to/3OYb9jk","Malorie", "Josh Malerman", 5d);
        livrariaOnline.adicionarLivro("https://amzn.to/45HQE1L", "E Não Sobrou Nenhum", "Agatha Christie", 50d);
        livrariaOnline.adicionarLivro("https://amzn.to/45u86q4", "Assassinato no Expresso do Oriente", "Agatha Christie", 5d);

        // Exibe todos os livros ordenados por preço
        System.out.println("Livros ordenados por preço: ");
        livrariaOnline.exibirLivrosOrdenadosPorPreco();

        // Pesquisa livros por autor
        String autorPesquisa = "Josh Malerman";
        List<Livro> livrosDoAutor = livrariaOnline.pesquisarLivrosPorAutor(autorPesquisa);
        System.out.println("Livros de " + autorPesquisa + ": ");
        for (Livro livro : livrosDoAutor) {
            System.out.println(livro);
        }

        // Obtém e exibe o livro mais caro
        System.out.println("Livro mais caro: " + livrariaOnline.obterLivroMaisCaro());

        // Obtém e exibe o livro mais barato
        System.out.println("Livro mais barato: " + livrariaOnline.exibirLivroMaisBarato());

        livrariaOnline.removerLivro("1984");
        System.out.println(livrariaOnline.livros);
    }
}
