package ro.ase.cts.main;

import ro.ase.cts.clase.CardBancar;

import javax.smartcardio.Card;

public class Main {
    public static void main(String[] args) {
        CardBancar card1 = CardBancar.getInstance("Ion ", "123456789 ", 20000, 1000);
        CardBancar card2 = CardBancar.getInstance("George ", "523456789 ", 15000, 2000);

        card1.afisareTranzactie();
        card2.afisareTranzactie();
    }
}
