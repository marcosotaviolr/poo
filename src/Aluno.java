public class Aluno {
    private int matricula;
    private String nome;
    private double mediaFinal;

    public Aluno(int matricula, String nome, double mediaFinal) {
        this.matricula = matricula;
        this.nome = nome;
        this.mediaFinal = mediaFinal;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getMediaFinal() {
        return mediaFinal;
    }

    public void setMediaFinal(double mediaFinal) {
        this.mediaFinal = mediaFinal;
    }

    public boolean verificarAprovacao() {
        return mediaFinal >= 6;
    }
}
