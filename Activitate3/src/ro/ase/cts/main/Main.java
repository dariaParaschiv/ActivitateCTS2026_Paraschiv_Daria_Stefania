package ro.ase.cts.main;

import ro.ase.cts.clase.CasaMarcat;

public class Main {
    public static void main(String[] args) {
        CasaMarcat casa = CasaMarcat.getInstance(1000, 1, 5);
        CasaMarcat casa2 = CasaMarcat.getInstance(1500, 2, 7);
        casa.inregistreazaVanzare(1000);

        casa.afisareRaportZilnic();
        casa2.afisareRaportZilnic();
    }
}
