package set.ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Aluno implements Comparable<Aluno> {
    private String nome;
    private long matricula;
    private double nota;
    public Aluno(String nome, long matricula, double nota) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota = nota;
    }

    @Override
    public int compareTo(Aluno aluno) {
        return nome.compareToIgnoreCase(aluno.getNome());
    }

    public String getNome() {
        return nome;
    }

    public long getMatricula() {
        return matricula;
    }

    public double getNota() {
        return nota;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aluno aluno)) return false;
        return getMatricula() == aluno.getMatricula();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMatricula());
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                ", nota=" + nota +
                '}';
    }

}

class ComparatorPorNota implements Comparator<Aluno>
{

    @Override
    public int compare(Aluno aluno1, Aluno aluno2) {
        return Double.compare(aluno1.getNota(), aluno2.getNota());
    }
}