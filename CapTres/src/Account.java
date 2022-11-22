//vamos criar uma classe Account que será usada em um metodo main
// será possivel identificar com nome
//sera possivel retornar o nome

public class Account {
    private String name; //name é o nome da conta. variavel de instancia. O que te  numa conta, nome
    private double balance; //uma conta tem o saldo
    private double deposit;


    public Account(){ //isso declara um construtor para que eu possa inicializar

    }
    public Account(String name, double balance){ //cria um contrutor que recebe uma string como parametro
        this.name = name;
        if (balance>0.0)
            this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getBalance() { //saldo da conta
        return balance;
    }

    public double retirada (double quantia){
        if (quantia <= balance){
            balance -= quantia;
        }else{
            quantia = 0;
            System.out.println("Valor de saque excede o saldo disponivel");
        }
        return quantia;
    }
    public void  deposit (double quantia){ //método que deposita, não retorna parametro e só deposita se a quantia for maior que 0
        if (quantia>0.0){
            balance += quantia;
        }
    }
}
