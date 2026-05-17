public class App {
    public static void main(String[] args) throws Exception {
        Carro carro1 = new Carro();
        carro1.marca = "Fiat";
        carro1.modelo = "Uno";
        carro1.ano = 2020;
        carro1.acelerar(50);
        carro1.exibir();
    }
}
