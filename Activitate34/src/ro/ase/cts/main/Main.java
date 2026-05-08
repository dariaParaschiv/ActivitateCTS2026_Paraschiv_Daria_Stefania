package ro.ase.cts.main;

import ro.ase.cts.clase.MedicamentFactory;
import ro.ase.cts.clase.MedicamentFlyweight;

public class Main {
    public static void main(String[] args) {
        MedicamentFactory fabrica = new MedicamentFactory();

        MedicamentFlyweight m1 = fabrica.getMedicament("Nurofen ");
        m1.afiseazaReteta("Alina ");

        MedicamentFlyweight m2 = fabrica.getMedicament("Nurofen ");
        m2.afiseazaReteta("Maria ");

        MedicamentFlyweight m3 = fabrica.getMedicament("Paracetamol ");
        m3.afiseazaReteta("Ioana ");

        if(m1 == m2){
            System.out.println("sunt la fel ");
        }
        else{
            System.out.println("sunt diferite ");
        }
    }
}
