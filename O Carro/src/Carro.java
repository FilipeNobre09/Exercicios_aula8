public class Carro {
    public String marca;
    public String modelo;
    public int ano;
    
    private int velocidade;

    public Carro(){
    }

    public void acelerar(int velT){
        velocidade += velT;
    }

    public void frear(int velT){
        velocidade-=velT;
    }

    public void exibir(){
        System.out.println("Marca: "+ marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Velocidade: " + velocidade);
    }
}
