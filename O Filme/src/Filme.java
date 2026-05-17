public class Filme {
    public String nome;
    public String diretor;
    public int anoLancamento;
    public int tempo;
    public double nota;

    public void exibitDetalhes(){
        System.out.println("Nome: "+nome);
        System.out.println("Diretor: "+diretor);
        System.out.println("Ano de lançamento: "+anoLancamento);
        System.out.println("Tempo (em minutos): "+tempo);
        System.out.println("Nota do filme: "+nota);
    }

    public int duracaoFormatada(int tempo){
        int horas=tempo/60;
        int min=tempo%60;
        System.out.println("Tempo: "+horas+":"+min);
        return tempo;
    }
    public boolean recomendado(){
        if (this.nota>=7.0) {
            return true;
        }else{
            return false;
        }
    }
}
