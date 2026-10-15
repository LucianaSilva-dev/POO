package Lista4.Questao4;

public class Pix extends Pagamento {
    @Override
    public double processar (double valor){
        double desconto = valor * 0.2;
        return valor - desconto;
    }
}
