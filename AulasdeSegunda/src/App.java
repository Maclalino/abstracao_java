package src;

public class App {
    public static void main(String[] args) {
        Carro meuCarro = new Carro("Fiat", "Argo", "Preto", 2020, 77777757l, "A676B");
        meuCarro.locomover();

        Moto minhaMoto= new Moto("Yamahha", "X80", "Preta", 2024, 222223, "73864AB");
        minhaMoto.locomover();

        Aviao meuAviao= new Aviao("Air", "728GP", "Branco", 2019, 283731, "89273GJ");
        meuAviao.locomover();

    }
}
