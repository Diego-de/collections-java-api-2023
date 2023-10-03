package set.Ordenacao.Exercicio;

import set.Ordenacao.Produto;

import java.util.Comparator;
import java.util.Objects;

public class Aluno implements Comparable<Aluno>{
    private String nome;
    private Long Matricula;
    private double nota;

    public Aluno(String nome, Long matricula, double nota) {
        this.nome = nome;
        Matricula = matricula;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public Long getMatricula() {
        return Matricula;
    }

    public double getNota() {
        return nota;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", Matricula=" + Matricula +
                ", nota=" + nota +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aluno aluno)) return false;
        return Objects.equals(getMatricula(), aluno.getMatricula());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMatricula());
    }


    @Override
    public int compareTo(Aluno p) {
        return nome.compareToIgnoreCase(p.getNome());
    }
}

class ComparatorByNota implements Comparator<Aluno> {
    @Override
    public int compare(Aluno p1, Aluno p2) {
        return Double.compare(p1.getNota(), p2.getNota());
    }
}
