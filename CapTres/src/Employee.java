public class Employee {
    private String nome;
    private String sobremone;
    private double salário;

    public Employee(){
    }
    public Employee(String nome, String sobremone, double salário){
        this.nome = nome;
        this.sobremone = sobremone;
        if (salário > 0) {
            this.salário = salário;
        }else{
            System.out.println("Salário invalido");
        }
    }
    public void setNome(String nome){ this.nome = nome; }
    public String getNome() { return nome;}

    public void setSobremone(String sobremone){this.sobremone = sobremone; }
    public String getSobremone(){return sobremone; }

    public void setSalário(double salário){this.salário = salário;}
    public double getSalário(){return salário; }
}
