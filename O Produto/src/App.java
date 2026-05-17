public class App {
    public static void main(String[] args) throws Exception {
        Produto produto1 = new Produto();
        produto1.nome = "Chave philips";
        produto1.preco = 6.25;
        produto1.quantidade_estoque = 100;
        produto1.vender(30);
        produto1.exibir();

    }
}
