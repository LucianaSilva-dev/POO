package Lista4.Questao5;

public class Mago extends Personagem {

    public Mago(String nome) {
        super(nome);
    }

    @Override
    public void atacar(){
        System.out.println("Lança bola de fogo");
    }
}
