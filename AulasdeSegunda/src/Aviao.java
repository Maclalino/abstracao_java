package src;
public class Aviao extends Veiculo {
     private String id;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public Aviao(String marca, String modelo, String cor, int ano, long numchassi, String id) {
        super(marca, modelo, cor, ano, numchassi);
        this.id= id;
        
    }

    @Override
    public void locomover(){
        System.out.println("O "+ getMarca() + "| "+ getModelo()+ "| " + getCor()+ "| "+ getAno()+"| "+ getId()+" está voando" );
    }
    
}
