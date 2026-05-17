public class Pet {
    public String nome;
    public String especie;
    public String raca;
    public int idade;
    public double peso;

    public void apresentacao(){
        System.out.println("Nome: "+nome);
        System.out.println("Espécie: "+especie);
        System.out.println("Raça: "+raca);
        System.out.println("Idade: "+idade);
        System.out.println("Peso: "+peso);
    }

    public int aniversario(int idade){
        return idade++;
    }

    public double avaliarPeso(double pesoIdeal){
        String situacao = " ";
        if (peso < pesoIdeal) {
          situacao="Está abaixo do peso"; 
        } else if (peso==pesoIdeal) {
            situacao="Está no peso ideal";
        }else{
            situacao="Está acima do peso";
          
        }
        System.out.println(nome+" "+situacao+" "+"("+peso+")"); 
        double diferenca = this.peso - pesoIdeal;
        return diferenca;
    }

}
