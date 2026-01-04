package je04_file;
import java.io.File;
import java.io.IOException;

public class JavaFileIO {
    public static void main(String[] args) {
        File diretorio = new File("/Users/guilhermemoreno/Desktop/Estudos-Java");


        System.out.println("Diretorio existe?" + diretorio.exists());

        if(!diretorio.exists()) {
            diretorio.mkdir();
            System.out.println("Diretorio criado com sucesso!");
        }

        try {
            File arquivo = new File("/Users/guilhermemoreno/Desktop/Estudos-Java/arquivo.txt");
            arquivo.createNewFile();
        } catch (IOException e ) {
            e.printStackTrace();
        }
    }
}
