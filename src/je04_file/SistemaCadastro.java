package je04_file;

import java.util.ArrayList;
import java.util.List;

public class SistemaCadastro {
    public static void main(String[] args) {
        List<Cadastro> cadastros = new ArrayList<>();
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
       } catch (Exception err) {
           err.printStackTrace();
       }
    }
}
