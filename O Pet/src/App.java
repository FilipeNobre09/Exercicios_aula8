public class App {
    public static void main(String[] args) throws Exception {
        Pet pet = new Pet();
        pet.nome="Rex";
        pet.especie="Cachorro";
        pet.raca="Pinsher";
        pet.idade=3;
        pet.peso=28.5;

        pet.apresentacao();
        pet.avaliarPeso(30);
    }
}
