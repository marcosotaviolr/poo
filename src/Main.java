public class Main {
    public static void main(String[] args) {
        Fatura fatura1 = new Fatura(1, "Mouse", 3, 50.0);
        System.out.println("Item: " + fatura1.getDescricao());
        System.out.println("Quantidade: " + fatura1.getQuantidade());
        System.out.println("Preço unitário: " + fatura1.getPrecoUnitario());
        System.out.println("Valor da fatura: " + fatura1.calcular_valor_fatura());

        Fatura fatura2 = new Fatura(2, "Teclado", -2, -100.0);
        System.out.println("Item: " + fatura2.getDescricao());
        System.out.println("Quantidade: " + fatura2.getQuantidade());
        System.out.println("Preço unitário: " + fatura2.getPrecoUnitario());
        System.out.println("Valor da fatura: " + fatura2.calcular_valor_fatura());
    }
}
