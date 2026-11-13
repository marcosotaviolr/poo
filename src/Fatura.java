public class Fatura {
    private int numeroItem;
    private String descricao;
    private int quantidade;
    private double precoUnitario;

    public Fatura(int numeroItem, String descricao, int quantidade, double precoUnitario) {
        this.numeroItem = numeroItem;
        this.descricao = descricao;
        setQuantidade(quantidade);
        setPrecoUnitario(precoUnitario);
    }

    public int getNumeroItem() {
        return numeroItem;
    }

    public void setNumeroItem(int numeroItem) {
        this.numeroItem = numeroItem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade > 0) {
            this.quantidade = quantidade;
        } else {
            this.quantidade = 0;
        }
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        if (precoUnitario > 0) {
            this.precoUnitario = precoUnitario;
        } else {
            this.precoUnitario = 0.0;
        }
    }

    public double calcular_valor_fatura() {
        return quantidade * precoUnitario;
    }
}
