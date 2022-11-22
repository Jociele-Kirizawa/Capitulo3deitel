import java.util.Scanner;

public class InvoceAplicação {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Invoce fatura = new Invoce();

        System.out.println("Qual produto voce deseja comprar? ");
        String produto = scan.nextLine();
        fatura.setTipo(produto);

        System.out.println("Qual quantidade do produto? ");
        int qtdade = scan.nextInt();
        fatura.setQuantidade(qtdade);

        System.out.println("Qual preço? ");
        double valor = scan.nextDouble();
        fatura.setPreço(valor);

        System.out.println("Valor total da fatura " + fatura.total(valor,qtdade));
    }
}
