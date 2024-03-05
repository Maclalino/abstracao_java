package src;

public abstract class Veiculo {
    private String marca;
    private String modelo;
    private String cor;
    private int ano;
    protected long numchassi;


    
    public Veiculo(String marca, String modelo, String cor, int ano, long numchassi) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.numchassi = numchassi;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public long getnumChassi() {
        return numchassi;
    }
    public void setnumChassi(long numchassi) {
        this.numchassi = numchassi;
    }

    public void locomover(){
        System.out.println("O"+ marca + "| "+ modelo+ "| " + cor+ "| "+ numchassi+"| está se locomovendo");
    }
}
