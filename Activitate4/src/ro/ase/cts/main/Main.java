package ro.ase.cts.main;

import ro.ase.cts.clase.PrototypeReteta;
import ro.ase.cts.clase.Reteta;

public class Main {
    public static void main(String[] args) {
        PrototypeReteta reteta1 = new Reteta("nurofen", 5, "durere de cap");
        PrototypeReteta reteta2 = reteta1.copiaza();
        ((Reteta) reteta1).setNumarIngrediente(7);
        System.out.println(reteta1.toString());
        System.out.println(reteta2.toString());
    }
}
