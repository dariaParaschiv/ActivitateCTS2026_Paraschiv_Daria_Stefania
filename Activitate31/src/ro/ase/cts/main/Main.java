package ro.ase.cts.main;

import ro.ase.cts.clase.MagazinFacade;

public class Main {
    public static void main(String[] args) {
        MagazinFacade magazin = new MagazinFacade();

        float pretDeAfisat = magazin.calculeazaPretFinal(101, 1);

        System.out.println("Pretul afisat in cos: " + pretDeAfisat);
    }
}
