public class Produto {
    public String nome;
    public double preco;
    public int quantidade_estoque;
    public int quantidade;

     public int vender(int quantidade){
        if (quantidade > 0 && this.quantidade_estoque>=0) {
            this.quantidade_estoque-= quantidade;
            return this.quantidade_estoque;
        } else {
            return 0;
        }
     }  
     public int repor(int quantidade){
        this.quantidade_estoque+=quantidade;
        return quantidade_estoque;
     }
     public double calcular_valor_total(){
        return this.preco * this.quantidade;
     }
     public void exibir(){
        System.out.println("Produto: "+ nome);
        System.out.println("Preço do produto: " + preco);
        System.out.println("Quantidade no estoque: " + quantidade_estoque);
    }
     
}
