package Lista3;

public class Turma {
    private Aluno[] alunos;
    private int contador;

    public Turma(int capacidade) {
        alunos = new Aluno[capacidade];
    }

    public boolean adicionarAluno(Aluno aluno) {
        if (contador >= alunos.length) {
            return false; // turma cheia
        }
        alunos[contador] = aluno;
        contador++;
        return true;
    }

    public void listarAprovados() {
        System.out.println("Aprovados:");
        for (int i = 0; i < contador; i++) {
            if (alunos[i].estaAprovado()) {
                System.out.println(alunos[i].getNome() + " - Média: " + alunos[i].calcularMedia());
            }
        }
    }

    public void listarReprovados() {
        System.out.println("Reprovados:");
        for (int i = 0; i < contador; i++) {
            if (!alunos[i].estaAprovado()) {
                System.out.println(alunos[i].getNome() + " - Média: " + alunos[i].calcularMedia());
            }
        }
    }
}
