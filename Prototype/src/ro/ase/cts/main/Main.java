package ro.ase.cts.main;

import ro.ase.cts.clase.PrototypeRezervare;
import ro.ase.cts.clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        PrototypeRezervare rezervare = new Rezervare("Ion", 3, "16:00", "0712356289");
        PrototypeRezervare rezervare2 = rezervare.copiaza();
        ((Rezervare) rezervare).setNrPersoane(5);

        System.out.println(rezervare.toString());
        System.out.println(rezervare2.toString());
    }
}
