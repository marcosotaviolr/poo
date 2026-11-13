public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private double velocidadeAtual = 0;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void acelerar(double valor) {
        velocidadeAtual += valor;
    }

    public void frear(double valor) {
        if (velocidadeAtual - valor >= 0) {
            velocidadeAtual -= valor;
        } else {
            velocidadeAtual = 0;
        }
    }
}
