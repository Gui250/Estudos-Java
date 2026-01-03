package je02_poo;

public class FabricaCarro {
    public static void main(String[] args) {
        Carro carro1 = new Carro("branca", "fiat", "palio");
        Carro carro2 = new Carro("branca", "fiat", "palio");
        Carro carro3 = new Carro("branca", "fiat", "palio");
        Carro carro4 = new Carro("branca", "fiat", "palio");
        Carro carro5 = new Carro("branca", "fiat", "palio");

        // Case 01
        System.out.println(carro1 == carro2);

        // Case 02
        System.out.println(carro1.equals(carro2));
    }
}
