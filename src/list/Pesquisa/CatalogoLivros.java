package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo,autor,anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> byAutor = new ArrayList<>();
        if (!livroList.isEmpty()){
            for (Livro list: livroList) {
                if (list.getAutor().equalsIgnoreCase(autor)){
                    byAutor.add(list);
                };
            }

        }
        return byAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> byAno = new ArrayList<>();
        if (!livroList.isEmpty()){
            for (Livro l: livroList) {
                if (l.getAnoPubicacao() >= anoInicial && l.getAnoPubicacao() <= anoFinal){
                    byAno.add(l);
                }
            }
        }
        return byAno;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroByTitle = null;
        if (!livroList.isEmpty()){
            for (Livro l: livroList){
                if (l.getTitulo().equalsIgnoreCase(titulo)){
                    livroByTitle = l;
                    break;
                }
            }
        }
        return livroByTitle;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2021);
        catalogoLivros.adicionarLivro("Livro 1", "Autor 2", 2020);
        catalogoLivros.adicionarLivro("Livro 2", "Autor 2", 2021);
        catalogoLivros.adicionarLivro("Livro 3", "Autor 3", 2022);
        catalogoLivros.adicionarLivro("Livro 4", "Autor 4", 2023);
        catalogoLivros.adicionarLivro("Livro 5", "Autor 5", 1994);


        System.out.println("");
        System.out.println("POR AUTOR");
        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 4"));
        System.out.println("");
        System.out.println("");
        System.out.println("POR ANO");
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2020,2021));
        System.out.println("");
        System.out.println("POR TITULO");
        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 1"));
    }
}
