package Lista4.Questao4;

public class Main {
    public static void main(String[] args){
        Pagamento p1 = new Cartao();
        Pagamento p2 = new BoletoBancario();
        Pagamento p3 = new Pix();

        double valor = 200;

        System.out.println("Usando Cartao de credito: " + p1.processar(valor));
        System.out.println("Usando boleto: " + p2.processar(valor));
        System.out.println("Usando Pix: "+ p3.processar(valor));
    }
}
