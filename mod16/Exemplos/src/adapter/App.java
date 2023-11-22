package adapter;

import java.io.File;

public class App {
    public static void main(String[] args) {
        String file = "texte.txt";
        DropBox drop = new DropBox();
        PersistenciaArquivos arquivos = new DropBoxAdapter(drop);
        arquivos.gravar(new File(file));
    }
}
