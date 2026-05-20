package set.pesquisaset;


import java.util.*;

public class GerenciadorAlunos{
    Set<Aluno> alunos = new HashSet<Aluno>();

    public GerenciadorAlunos() {
        this.alunos = new HashSet<Aluno>();
    }

    public void adicionarAluno(String nome, Long matricula, double media){
        alunos.add(new Aluno(nome,matricula,media));
    }

    public void removerAluno(long matricula) {
        Aluno alunoASerRemovido = null;
        for (Aluno aluno : alunos) {
            if (aluno.getMatricula() == matricula) {
                alunoASerRemovido = aluno;
                break;
            }
        }
        alunos.remove(alunoASerRemovido);
    }

    public void exibirAlunos() {
        System.out.println(alunos);
    }

    public void exibirAlunosPorNome(){
        List<Aluno> alunosOrdenados = new ArrayList<Aluno>(alunos);
        Collections.sort(alunosOrdenados);
        System.out.println(alunosOrdenados);
    }

    public void exibirAlunosPorNota(){
        List<Aluno> alunosOrdenados = new ArrayList<Aluno>(alunos);
        Collections.sort(alunosOrdenados);
        System.out.println(alunosOrdenados);
    }
}
