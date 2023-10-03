package map.Pesquisa.Exercicio;

import map.Pesquisa.Produto;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String,Integer> contagemPalavraMap;

    public ContagemPalavras() {
        this.contagemPalavraMap = new HashMap<>();
    }

    public void adicionarPalavras(String palavra, Integer contagem){
        contagemPalavraMap.put(palavra,contagem);
    }

    public void removerPalavra(String palavra){
        if (!contagemPalavraMap.isEmpty()){
            contagemPalavraMap.remove(palavra);
        }
    }

    public int exibirContagemPalavras(){
        int contador = 0;
        for (int contagem : contagemPalavraMap.values()) {
            contador += contagem;
        }
        return contador;
    }


    public String encontrarPalavrasMaisFrequente() {

        String palavraMaisFrequente = null;
        int maiorContagem = Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> entry : contagemPalavraMap.entrySet()) {
            String palavra = entry.getKey();
            int contagem = entry.getValue();

            if (contagem > maiorContagem) {
                palavraMaisFrequente = palavra;
                maiorContagem = contagem;
            }
        }

        return palavraMaisFrequente;

    }

    public static void main(String[] args) {
        ContagemPalavras contagemLinguagens = new ContagemPalavras();

        // Adiciona linguagens e suas contagens
        contagemLinguagens.adicionarPalavras("Java", 2);
        contagemLinguagens.adicionarPalavras("Python", 8);
        contagemLinguagens.adicionarPalavras("JavaScript", 1);
        contagemLinguagens.adicionarPalavras("C#", 6);

        // Exibe a contagem total de linguagens
        System.out.println("Existem " + contagemLinguagens.exibirContagemPalavras() + " palavras.");

        // Encontra e exibe a linguagem mais frequente
        String linguagemMaisFrequente = contagemLinguagens.encontrarPalavrasMaisFrequente();
        System.out.println("A linguagem mais frequente é: " + linguagemMaisFrequente);
    }


}
