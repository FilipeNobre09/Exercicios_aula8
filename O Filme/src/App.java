public class App {
    public static void main(String[] args) throws Exception {
        Filme filme = new Filme();
        filme.nome = "Interestelar";
        filme.diretor = "Christopher Nolan";
        filme.anoLancamento = 2014;
        filme.tempo=196;
        filme.nota = 9.8;
        filme.exibitDetalhes();
        filme.duracaoFormatada(filme.tempo);
    }
}
