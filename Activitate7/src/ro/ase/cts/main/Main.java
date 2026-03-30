package ro.ase.cts.main;

import ro.ase.cts.clase.LoggerSpital;

import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        LoggerSpital log1 = LoggerSpital.getInstance(5, " ATI");
        LoggerSpital log2 = LoggerSpital.getInstance(7, " Pediatrie");

        log1.logheazaEveniment("URGENTA");

        log1.afisareDescriere();
        log2.afisareDescriere();
    }
}
