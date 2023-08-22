package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoPessoa {
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, Double altura){
        this.pessoaList.add(new Pessoa(nome,idade,altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoaByIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoaByIdade);
        return pessoaByIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoaByAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoaByAltura, new Pessoa.ComparatorPorAltura());
        return pessoaByAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa pessoa = new OrdenacaoPessoa();

        pessoa.adicionarPessoa("Nome 1", 20, 1.56);
        pessoa.adicionarPessoa("Nome 2", 30, 1.80);
        pessoa.adicionarPessoa("Nome 3", 25, 1.70);
        pessoa.adicionarPessoa("Nome 4", 17, 1.56);

        System.out.println("----------------------------------");
        System.out.println("");
        System.out.println("Idade Ordenada:" + pessoa.ordenarPorIdade());
        System.out.println("");
        System.out.println("");
        System.out.println("Altura Ordenada:" + pessoa.ordenarPorAltura());
        System.out.println("");


    }


}
