package list.Ordenacao.Exercicio;

import list.Ordenacao.Pessoa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoNumeros  {

    private List<Integer> numero = new ArrayList<>();

    public void adicionarNumero(int num){
        numero.add(num);
    }

    public List<Integer> ordenarAscendente(){
        List<Integer> numAsc = new ArrayList<>(numero);
        Collections.sort(numAsc);
        return numAsc;
    }


    public List<Integer> ordenarDescendente(){
        List<Integer> numDesc = new ArrayList<>(numero);
        numDesc.sort(Collections.reverseOrder());
        return numDesc;
    }


    public static void main(String[] args) {
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();
        numeros.adicionarNumero(2);
        numeros.adicionarNumero(5);
        numeros.adicionarNumero(4);
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(99);

        System.out.println(numeros.ordenarAscendente());

        System.out.println(numeros.ordenarDescendente());

    }
}
