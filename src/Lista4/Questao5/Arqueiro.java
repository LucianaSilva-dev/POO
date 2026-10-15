package Lista4.Questao5;

public class Arqueiro extends Personagem {

    public Arqueiro(String nome) {
        super(nome);
    }

    @Override
    public void atacar(){
        System.out.println("Ataca com flechas");
    }
}
