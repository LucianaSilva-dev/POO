package Lista4.Questao5;

public class Guerreiro extends Personagem {

    public Guerreiro(String nome) {
        super(nome);

    }

    @Override
    public void atacar(){
        System.out.println("Golpeia com a espada");
    }

}
