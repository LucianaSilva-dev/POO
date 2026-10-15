package Lista4.Questao4;

public class BoletoBancario extends Pagamento {
    @Override
    public double processar (double valor){
        double desconto = valor * 0.1;
        return valor - desconto;
    }
}
