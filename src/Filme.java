public class Filme {
    private String titulo;
    private String diretor;
    private int anoLancamento;
    private int duracao;

    public Filme(String titulo, String diretor, int anoLancamento, int duracao) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.anoLancamento = anoLancamento;
        this.duracao = duracao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public void exibir() {
        System.out.println("Título: " + titulo);
        System.out.println("Diretor: " + diretor);
        System.out.println("Ano de lançamento: " + anoLancamento);
        System.out.println("Duração: " + duracao + " minutos");
    }
}
