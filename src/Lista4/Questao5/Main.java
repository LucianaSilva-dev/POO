package Lista4.Questao5;

public class Main {
    public static void main(String[] args){
        Personagem personagem1 = new Guerreiro("Guerreiro");
        Personagem personagem2 = new Mago("Mago");
        Personagem personagem3 = new Arqueiro("Arqueiro");

        personagem1.atacar();
        personagem2.atacar();
        personagem3.atacar();

    }
}
