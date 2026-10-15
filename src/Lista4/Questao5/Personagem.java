package Lista4.Questao5;

public abstract class Personagem {

    protected String nome;

    public Personagem(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public abstract void atacar ();
}

