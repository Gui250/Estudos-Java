package je02_poo;

public class SistemaEnumeracao {
    public static void main(String[] args) {
        for (EstadoBrasileiro eb : EstadoBrasileiro.values()) {
            System.out.println("Estado Localizado");
            System.out.println(eb.getNome());
            System.out.println(eb.name());
            System.out.println(eb.getSigla());
        }

    }
}
