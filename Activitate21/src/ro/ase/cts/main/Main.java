package ro.ase.cts.main;

import ro.ase.cts.clase.Telefon;

public class Main {
    public static void main(String[] args) {
        Telefon telefon1 = Telefon.getInstance("Alin ", "Samsung ", 5, 20);
        Telefon telefon2 = Telefon.getInstance("Marian ", "Iphone ", 8, 50);
        System.out.println(telefon1.toString());
        System.out.println(telefon2.toString());
    }
}
