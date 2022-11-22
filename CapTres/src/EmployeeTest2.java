import java.util.Scanner;

public class EmployeeTest2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Employee colaborador = new Employee();
        Employee colaborador2 = new Employee();

        System.out.println("Qual seu nome?");
        String nome = scan.nextLine();
        System.out.println("Qual seu sobrenome?");
        String sobrenome = scan.nextLine();
        System.out.println("Qual seu salario anual?");
        double salario = scan.nextDouble();

        colaborador.setNome(nome);
        colaborador.setSobremone(sobrenome);
        colaborador.setSalário(salario);

        System.out.println(colaborador.getNome() + colaborador.getSobremone() + colaborador.getSalário());
        colaborador.setSalário(salario*1.1);
        System.out.println(colaborador.getNome() + colaborador.getSobremone() + "Novo salário" + colaborador.getSalário());

        System.out.println("Qual seu nome?");
        String nome2 = scan.nextLine();
        System.out.println("Qual seu sobrenome?");
        String sobrenome2 = scan.nextLine();
        System.out.println("Qual seu salario anual?");
        double salario2 = scan.nextDouble();

        colaborador2.setNome(nome2);
        colaborador2.setSobremone(sobrenome2);
        colaborador2.setSalário(salario2);

        System.out.println(colaborador2.getNome()+ colaborador2.getSobremone()+ colaborador2.getSalário());

        colaborador2.setSalário(salario2*1.1);
        System.out.println(colaborador2.getNome()+ colaborador2.getSobremone()+ colaborador2.getSalário());


    }
}
