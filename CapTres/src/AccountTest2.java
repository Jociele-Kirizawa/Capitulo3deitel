import java.util.Scanner;

public class AccountTest2 {
    public static void displayAccount(Account exibirdetalhes){
        System.out.println(exibirdetalhes.getName());
        System.out.println(exibirdetalhes.getBalance());
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Account conta1 = new Account("Jociele", 50);// Construtor com dois parâmetros da classe Account
        Account conta2 = new Account("Antonio", -7);

        System.out.println("Saldo da conta 1 " + conta1.getBalance()); //Quando o método getBalance é chamado por account1
        System.out.println("Saldo da conta2 " + conta2.getBalance()); //O balance de account2 é inicialmente 0.00 porque

        //o construtor rejeitou a tentativa de iniciar account2 com um saldo negativo, assim o saldo retém seu valor inicial padrão


        System.out.println("Quanto voce quer depositar?");
        double quantia = scan.nextDouble();
        conta1.deposit(quantia);

        System.out.println("Quanto voce quer depositar?");
        double quantia2 = scan.nextDouble();
        conta2.deposit(quantia2);

        System.out.println("Saldo da conta 1 " + conta1.getBalance() + conta1.getName());
        System.out.println("Saldo da conta2 " + conta2.getBalance() + conta2.getName());





    }
}
