package Lista2.Questao4;

public class ContaCorrente {
    private int numero;
    private String titular;
    private float saldo;

    public ContaCorrente(int numero, String titular){
        this.numero = numero;
        this.titular = titular;
        saldo = 0;
    }

    public boolean sacar(float valor){
        if(valor > saldo || valor > 10000) return false;
        saldo -= valor;
        return true;
    }

    public boolean depositar(float valor){
        if(valor <= 0 || valor > 10000) return false;
        saldo += valor;
        return true;
    }

    public float consultarSaldo(){

        return saldo;
    }
}

