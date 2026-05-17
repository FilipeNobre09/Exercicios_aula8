public class App {
    public static void main(String[] args) throws Exception {
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Filipe";
        aluno1.RA = "123456789";
        aluno1.nota1 = 8.5;
        aluno1.nota2 = 4.8;
        aluno1.Media(aluno1.nota1, aluno1.nota2);
        aluno1.exibirBoletim();
    }
}
