import java.util.Scanner;

public class AccountTest3 {
    public static void main(String[] args) {

        Account contaretirada = new Account("Maria", 50);
        Scanner scan = new Scanner(System.in);

        System.out.println("Quanto você quer retirar?");
        double retirada = scan.nextDouble();
        System.out.println("Vodê retirou: " + contaretirada.retirada(retirada) + "Seu novo saldo" + contaretirada.getBalance());


    }
}
