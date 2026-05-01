package ro.ase.cts.main;

import ro.ase.cts.clase.CardBancar;
import ro.ase.cts.clase.EWallet;
import ro.ase.cts.clase.PlataAdaptor;

public class Main {
    public static void main(String[] args) {
        CardBancar card = new CardBancar("BCR ", "Alina");
        card.platesteLaTerminal(200);
        EWallet eWallet = new EWallet("Alex ");
        eWallet.efectueazaPlataOnline(300);
        CardBancar plata = new PlataAdaptor("BCR ", "Cristina ", eWallet);
        plata.platesteLaTerminal(500);
    }
}
