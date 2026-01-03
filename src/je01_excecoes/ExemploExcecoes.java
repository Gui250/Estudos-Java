package je01_excecoes;

public class ExemploExcecoes {
    public static void main(String[] args) {
        try {
            Double valor = Double.valueOf("a1,75");
            System.out.println(valor);
        } catch(NumberFormatException ex) {
            System.err.println("Número inválido");
        }
    }
}
