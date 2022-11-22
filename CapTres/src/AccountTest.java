import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Account contaDaJociele = new Account();// aqui, se eu quiser, posso inicializar o construtor
        Account contaDoAntonio = new Account();


        System.out.printf("Nome inicial da conta: %s%n%n", contaDaJociele.getName());
        System.out.printf("Nome inicial da conta2: %s%n%n", contaDoAntonio.getName());

        System.out.println("Entre com seu nome:");
        String nome = scan.nextLine();
        contaDaJociele.setName(nome); //insere nome na contadajociele
        System.out.println();//gera linha em branco

        System.out.println("Entre com o nome da conta 2:");
        String nome2 = scan.nextLine();
        contaDoAntonio.setName(nome2);
        System.out.println();

        System.out.printf("O nome da contadaJociele é: %n%s%n", contaDaJociele.getName()); //mostraonome
        System.out.printf("O nome da contadaoAntonio é: %n%s%n", contaDoAntonio.getName());


    }
}
/*quando um objeto de classe Account  é criado, sua variável de instância String
chamada name é inicializada como null por padrão. Mas e se você quiser oferecer um nome ao desenvolver um objeto Account?
Cada classe que você declara tem como fornecer um construtor com parâmetros que podem ser utilizados para inicializar um
objeto de uma classe quando o objeto for criado. O Java requer uma chamada de construtor para cada objeto que é desenvolvido,
então esse é o ponto ideal para inicializar variáveis de instância de um objeto. */