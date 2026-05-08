package ro.ase.cts.main;

import ro.ase.cts.clase.Bautura;
import ro.ase.cts.clase.CafeaSimpla;
import ro.ase.cts.decorator.DecoratorLapte;
import ro.ase.cts.decorator.DecoratorZahar;

public class Main {
    public static void main(String[] args) {
        Bautura cafea = new CafeaSimpla();
        System.out.println(cafea.getDescriere() + " - " + cafea.calculeazaPret());

        Bautura cafeaCuLapte = new DecoratorLapte(cafea);
        System.out.println(cafeaCuLapte.getDescriere() + " - " + cafeaCuLapte.calculeazaPret());

        Bautura cafeaCompleta = new DecoratorZahar(cafeaCuLapte);
        System.out.println(cafeaCompleta.getDescriere() + " - " + cafeaCompleta.calculeazaPret());
    }
}
