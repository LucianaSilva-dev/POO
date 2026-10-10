package Lista3;

public class MainAluno {
    public static void main(String[] args) {
        Turma turma = new Turma(3);

        Aluno a1 = new Aluno("Ana", 1);
        a1.cadastrarNota(8);
        a1.cadastrarNota(7.5);

        Aluno a2 = new Aluno("Bruno", 2);
        a2.cadastrarNota(4);
        a2.cadastrarNota(6);

        turma.adicionarAluno(a1);
        turma.adicionarAluno(a2);

        turma.listarAprovados();
        turma.listarReprovados();


    }
}
