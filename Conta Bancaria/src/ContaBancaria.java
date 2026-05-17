public class ContaBancaria {
    public String titular;
    public String numeroConta;
    public double saldo;

    public double depositar(double valor){
        return this.saldo+=valor;
    }

    public double sacar(double valor){
        return this.saldo-=valor;
    }

    public void exibir_extrato(){
        System.out.println("Titutar da conta: "+titular);
        System.out.println("Número da conta: "+numeroConta);
        System.out.println("Extrato: "+saldo);
    }
}
