package ro.ase.cts.main;

import ro.ase.cts.clase.ContBancar;
import ro.ase.cts.clase.ContProxy;

public class Main {
    public static void main(String[] args) {
        ContBancar cont = new ContBancar("Ana ");
        ContProxy proxy = new ContProxy(cont);

        proxy.retrageBani(500);
    }
}
