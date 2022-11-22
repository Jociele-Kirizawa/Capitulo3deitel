public class Invoce {
    private String tipo;
    private int quantidade;
    private double preço;

    public Invoce() {

    }
    public Invoce( String tipo, int quantidade, double preço){
        this.tipo = tipo;
        this.quantidade = quantidade;
        this.preço = preço;
     }

    public void setPreço(double preço) {
        this.preço = preço;
    }
    public double getPreço() {
        return preço;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getTipo(){ return tipo;
     }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public double total (double preço, int quantidade){
        if (preço>=0 && quantidade>=0){
            return preço*quantidade;
        }else {
            preço = 0;
            quantidade = 0;
            System.out.println("Operação indiponivel");
        }
        return preço;
    }

    }

