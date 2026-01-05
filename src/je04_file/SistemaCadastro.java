package je04_file;

import java.nio.file.Files;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.nio.file.Path;
import java.nio.file.Paths;


public class SistemaCadastro {
    public static void main(String[] args) {
        List<Cadastro> cadastros = new ArrayList<>();

        cadastros.add(new Cadastro("Boby Moreno", "M", 83214865L, LocalDate.of(2015, 7, 15), 100.0, true));
        cadastros.add(new Cadastro("Izabelly", "M", 83214865L, LocalDate.of(2004, 7, 15), 100.0, true));

        escreverLayoutDelimitado(cadastros);
    }

    public static void escreverLayoutDelimitado(List<Cadastro> cadastros) {
        System.out.println("****** - LAYOUT DELIMITADO - *****");
       try {
           StringBuilder conteudo = new StringBuilder();

           for (Cadastro cadastro : cadastros) {
               conteudo.append(cadastro.getNome() + ";");
               conteudo.append(cadastro.getSexo() + ";");
               conteudo.append(cadastro.getTelefone() + ";");
               conteudo.append(cadastro.getDataNascimento() + ";");
               conteudo.append(cadastro.getValorSugerido() + ";");
               conteudo.append(cadastro.getCliente() + ";");
           }
           Path arquivoDestino = Paths.get("/Users/guilhermemoreno/Desktop/Estudos-Java/lista-contatos.csv");
           Files.write(arquivoDestino, conteudo.toString().getBytes());

       } catch (Exception err) {
           err.printStackTrace();
       }
    }
}
