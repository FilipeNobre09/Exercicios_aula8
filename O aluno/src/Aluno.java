public class Aluno {
    public String nome;
    public String RA;

    public double nota1;
    public double nota2;

    public double Media(double nota1, double nota2){
        double media = (nota1+nota2)/2;
        return media;
    }

    public String Situação(){
        if (Media(nota1, nota2) > 6.0) {
            return "Aprovado";
        } else {
            return "Reprovado"; 
        }
    }

    public void exibirBoletim(){
        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + RA);
        System.out.println("Nota: " + nota1 + " | Nota: " + nota2);
        System.out.println("Media: " + Media(nota1, nota2));
        System.out.println("Situação: " + Situação());
    }
}
