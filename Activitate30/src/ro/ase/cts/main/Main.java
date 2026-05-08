package ro.ase.cts.main;

import ro.ase.cts.clase.CheckInFacade;

public class Main {
    public static void main(String[] args) {
        CheckInFacade aeroport = new CheckInFacade();
        aeroport.proceseazaCheckIn("Alina ", "111 ", 20.5f);
        aeroport.proceseazaCheckIn("Ion ", "223 ", 35.5f);
    }
}
