package je05_excecoes;

public class Excecoes {
    static void main(String[] args) {
        try {
            Double valor = (double) 100 / 2;
            System.out.println(valor);
        } catch (Exception e) {
            System.out.println("erro");
        } finally {
            System.out.println("Finally bloco");
        }
    }
}
