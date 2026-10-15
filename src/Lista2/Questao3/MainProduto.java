package Lista2.Questao3;

public class MainProduto {
    public static void main(String[] args) {
        Produto p = new Produto(1, "Caderno", 15.90, 50);

        System.out.println("--- Informações iniciais ---");
        p.exibirInfo();

        System.out.println("\n--- Testando setPreco ---");
        p.setPreco(-5);
        p.setPreco(0);
        p.setPreco(18.50);

        System.out.println("\n--- Informações após alterações ---");
        p.exibirInfo();

        System.out.println("\n--- Usando os getters ---");
        System.out.println("Código: " + p.getCodigo());
        System.out.println("Nome: " + p.getNome());
        System.out.println("Preço: " + p.getPreco());
        System.out.println("Estoque: " + p.getEstoque());
    }
}

