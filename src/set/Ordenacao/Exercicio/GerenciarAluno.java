package set.Ordenacao.Exercicio;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciarAluno {
    private Set<Aluno> alunoSet;

    public GerenciarAluno() {
        this.alunoSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double media){
        alunoSet.add(new Aluno(nome, matricula, media));
    }

    public void  removerAluno(long matricula){
        Aluno removerAluno = null;
        if (!alunoSet.isEmpty()){
            for (Aluno a:alunoSet) {
                if (a.getMatricula() == matricula){
                    removerAluno = a;
                    break;
                }
            }
        }
        alunoSet.remove(removerAluno);
    }

    public void exibirAlunosPorNome(){
        Set<Aluno> alunoByNome = new TreeSet<>(alunoSet);
        System.out.println(alunoByNome);
    }

    public void exibirAlunosPorNota(){
        Set<Aluno> alunoByNota = new TreeSet<>(new ComparatorByNota());
        alunoByNota.addAll(alunoSet);
        System.out.println(alunoByNota);
    }

    public void exibirAlunos(){
        System.out.println(alunoSet);
    }

    public static void main(String[] args) {
        // Criando uma instância do GerenciadorAlunos
        GerenciarAluno gerenciadorAlunos = new GerenciarAluno();

        // Adicionando alunos ao gerenciador
        gerenciadorAlunos.adicionarAluno("João", 123456L, 7.5);
        gerenciadorAlunos.adicionarAluno("Maria", 123457L, 9.0);
        gerenciadorAlunos.adicionarAluno("Carlos", 123458L, 5.0);
        gerenciadorAlunos.adicionarAluno("Ana", 123459L, 6.8);

        // Exibindo todos os alunos no gerenciador
        System.out.println("Alunos no gerenciador:");
        System.out.println(gerenciadorAlunos.alunoSet);
        System.out.println(" ");

        // Removendo um aluno com matrícula inválida e outro pelo número de matrícula
        System.out.println("Removendo Alunos : ");
        gerenciadorAlunos.removerAluno(000L);
        gerenciadorAlunos.removerAluno(123457L);
        System.out.println(gerenciadorAlunos.alunoSet);
        System.out.println(" ");

        // Exibindo alunos ordenados por nome
        System.out.println("Exibindo alunos ordenados por nome : ");
        gerenciadorAlunos.exibirAlunosPorNome();
        System.out.println(" ");


        // Exibindo alunos ordenados por nota
        System.out.println("Exibindo alunos ordenados por nota : ");
        gerenciadorAlunos.exibirAlunosPorNota();
    }

}
