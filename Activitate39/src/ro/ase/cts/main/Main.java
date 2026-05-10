package ro.ase.cts.main;

import ro.ase.cts.clase.ComandaResize;
import ro.ase.cts.clase.DocumentFoto;
import ro.ase.cts.clase.EditorInvoker;
import ro.ase.cts.clase.IComanda;

public class Main {
    public static void main(String[] args) {
        DocumentFoto pozaVacanta = new DocumentFoto("vacanta.jpg");

        IComanda resizeMica = new ComandaResize(pozaVacanta, 800, 600);
        IComanda resizeMare = new ComandaResize(pozaVacanta, 1900, 1000);

        EditorInvoker editor = new EditorInvoker();

        editor.inregistreazaOperatie(resizeMica);
        editor.inregistreazaOperatie(resizeMare);

        System.out.println("Se proceseaza transformarile foto ");
        editor.executaOperatii();
    }
}
