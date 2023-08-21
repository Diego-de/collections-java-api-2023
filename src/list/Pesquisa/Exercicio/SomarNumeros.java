package list.Pesquisa.Exercicio;

import list.Pesquisa.Livro;

import java.util.ArrayList;
import java.util.List;

public class SomarNumeros {

    private List<Integer> inteiros = new ArrayList<>();

    public SomarNumeros() {
    }

    public  void adicionarNumero(int numero){
        inteiros.add(numero);
    }

    public int calcularSoma(){
        int soma = 0;
        for (int valor: inteiros) {
            soma += valor;
        }

        return soma;
    }

    public int encontrarMaiorNumero(){
       int maiorValor = 0;
       if (!inteiros.isEmpty()){
           for (int v: inteiros) {
                if (v > maiorValor){
                    maiorValor = v;
                }
           }
       }

    return maiorValor;
    }

    public int encontrarMenorNumero(){
        int menorValor = 0;
        if (!inteiros.isEmpty()){
            for (int v: inteiros) {
                if (v < menorValor){
                    menorValor = v;
                }
            }
        }

        return menorValor;
    }

    @Override
    public String toString() {
        return "SomarNumeros{" +
                "inteiros=" + inteiros +
                '}';
    }

    public void exibirNumeros(){
        System.out.println(inteiros.toString());
    }

    public static void main(String[] args) {
        SomarNumeros somaNumeros = new SomarNumeros();

        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(-2);
        somaNumeros.adicionarNumero(10);
        somaNumeros.exibirNumeros();

        System.out.println("Soma dos números = " + somaNumeros.calcularSoma());
        System.out.println("Maior número = " + somaNumeros.encontrarMaiorNumero());
        System.out.println("Menor número = " + somaNumeros.encontrarMenorNumero());
    }

}
