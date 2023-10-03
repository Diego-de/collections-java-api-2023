package map.OperacoesBasicas.Exercicio;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {

    private Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao){
        dicionarioMap.put(palavra,definicao);
    }

    public void removerPalavra(String palavra){
        if (!dicionarioMap.isEmpty()){
            dicionarioMap.remove(palavra);
        }
    }

    public void exibirPalavras(){
        if (!dicionarioMap.isEmpty()){
            System.out.println(dicionarioMap);
        }else {
            System.out.println("Palavra não existe!");
        }
    }

    public String pesquisarPorPalavra(String palavra){
        String searchForWord = null;
        if (!dicionarioMap.isEmpty()) {
            searchForWord = dicionarioMap.get(palavra);
        }else {
            searchForWord = "Não encontrado@!";
        }
        return searchForWord;
    }
    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        // Adicionar palavras (linguagens de programação)
        dicionario.adicionarPalavra("java", "Linguagem de programação orientada a objetos.");
        dicionario.adicionarPalavra("typescript", "Superset da linguagem JavaScript que adiciona tipagem estática.");
        dicionario.adicionarPalavra("kotlin", "Linguagem moderna de programação para a JVM.");

        // Exibir todas as palavras
        System.out.println("Exibir todas as palavras");
        dicionario.exibirPalavras();
        System.out.println("");


        // Pesquisar palavras
        String definicaoJava = dicionario.pesquisarPorPalavra("java");
        System.out.println("Definição da linguagem 'java': " + definicaoJava);
        System.out.println("");

        System.out.println("Pesquisar por uma palavra diferente da adicionada!");
        String definicaoCSharp = dicionario.pesquisarPorPalavra("csharp");
        System.out.println(definicaoCSharp);
        System.out.println("");


        // Remover uma palavra
        System.out.println("Remover uma palavra");
        dicionario.removerPalavra("typescript");
        dicionario.exibirPalavras();
    }
}
