package je02_poo;

public class Sistema {
    public static void main(String[] args) {
        Cliente gleyson = new Cliente("Gleyson");
        System.out.println(gleyson.limiteCredito);
        gleyson.solicitarLimiteCredito(200.0);
        gleyson.nome = "Gleyson";
        System.out.println(gleyson.limiteCredito);
    }
}
