package je02_poo;
import java.math.BigDecimal;

public class ClassesEssenciais {
    public static void main(String[] args) {
        BigDecimal zero = BigDecimal.ZERO;
        BigDecimal dez = BigDecimal.TEN;

        BigDecimal decimal = BigDecimal.valueOf(1234.5678);
        BigDecimal numeroString = new BigDecimal("1234.5678");

        // Adicionando outro bigdecimal ao zero
        BigDecimal resultado = zero.add(new BigDecimal("100"));
        System.out.println(resultado);
        // Subtraindo outro bigdecimal ao 100
        resultado = resultado.subtract(new BigDecimal("27.5"));
        System.out.println(resultado);
    }
}
