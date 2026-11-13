public class Elevador {
    private int andarAtual;
    private int totalAndares;
    private int capacidade;
    private int pessoasPresentes;

    public void inicializar(int capacidade, int totalAndares) {
        this.capacidade = capacidade;
        this.totalAndares = totalAndares;
        andarAtual = 0;
        pessoasPresentes = 0;
    }

    public void entrar() {
        if (pessoasPresentes < capacidade) {
            pessoasPresentes++;
        }
    }

    public void sair() {
        if (pessoasPresentes > 0) {
            pessoasPresentes--;
        }
    }

    public void subir() {
        if (andarAtual < totalAndares) {
            andarAtual++;
        }
    }

    public void descer() {
        if (andarAtual > 0) {
            andarAtual--;
        }
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    public void setTotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getPessoasPresentes() {
        return pessoasPresentes;
    }

    public void setPessoasPresentes(int pessoasPresentes) {
        this.pessoasPresentes = pessoasPresentes;
    }
}
