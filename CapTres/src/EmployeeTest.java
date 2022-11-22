public class EmployeeTest {
    public static void main(String[] args) {

        Employee empregado = new Employee("Jociele", "Kirizawa", 42000);
        Employee empregado2 = new Employee("Angela", "Marta", 72000);

        System.out.println("Salario inicial "+empregado.getNome() + empregado.getSalário());
        System.out.println("Salário inicial " + empregado2.getNome() + empregado2.getSalário());

       empregado.setSalário(4200*1.1);
       empregado2.setSalário(72000*1.1);

        System.out.println("Novo salário" + empregado.getNome() + empregado.getSalário());
        System.out.println("Novo salário" + empregado2.getNome() + empregado2.getSalário());
    }
}
