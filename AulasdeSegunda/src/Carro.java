package src;
public class Carro extends Veiculo {

    private String placa;
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public Carro(String marca, String modelo, String cor, int ano, long numchassi, String placa) {
        super(marca, modelo, cor, ano, numchassi);
        this.placa=placa;
    }
    
    @Override
    public void locomover(){
    System.out.println("O "+ getMarca() + "| "+ getModelo()+ "| " + getCor()+ "| "+ getAno()+"| "+ getPlaca()+" está se locomovendo" );
    }
}
