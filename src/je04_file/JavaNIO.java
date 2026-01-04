package je04_file;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class JavaNIO {
    public static void main(String[] args) {
        try {
            Path path = Paths.get("/Users/guilhermemoreno/Desktop/Estudos-Java/arquivo.txt");
            // Como sao bytes podemos criar uma string a partir de agora
            List<String> conteudo = Files.readAllLines(path);
            conteudo.forEach(l -> System.out.println(l));

            // Escrevendo no arquivo
            List<String> nomes = new ArrayList<>();
            nomes.add("Gleyson");
            nomes.add("Izabelly");
            StringBuilder conteudoEscrito = new StringBuilder();
            nomes.forEach(n -> conteudoEscrito.append(n).append("\n"));
            Files.write(path, conteudoEscrito.toString().getBytes(StandardCharsets.UTF_8));
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
