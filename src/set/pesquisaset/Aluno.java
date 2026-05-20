package set.pesquisaset;

import java.util.ArrayList;

public class Aluno implements Comparable<Aluno> {
   private String nome;
   private long matricula;
   private double media;

    public Aluno(String nome, long matricula, double media) {
        this.nome = nome;
        this.media = media;
        this.matricula = matricula;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int compareTo(Aluno o) {

        return this.nome.compareToIgnoreCase(o.getNome());

    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                ", media=" + media +
                '}';
    }
}
