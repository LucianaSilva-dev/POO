package Lista4.Questao4;

public class Cartao extends Pagamento {
    @Override
    public double processar (double valor){
        double taxa = valor * 0.05;
        return valor + taxa;
    }
}
