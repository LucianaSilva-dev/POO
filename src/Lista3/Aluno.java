package Lista3;

public class Aluno {
    private String nome;
    private int matricula;
    private double[] notas = new double[4];
    private int contador;

    public Aluno(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public boolean cadastrarNota(double nota) {
        if (contador >= notas.length) {
            return false;
        }
        notas[contador] = nota;
        contador++;
        return true;
    }

    public double calcularMedia() {
        if (contador == 0) {
            return 0;
        }
        double soma = 0;
        for (int i = 0; i < contador; i++) {
            soma += notas[i];
        }
        return soma / contador;
    }

    public boolean estaAprovado() {
        return calcularMedia() >= 7.0;
    }
}
