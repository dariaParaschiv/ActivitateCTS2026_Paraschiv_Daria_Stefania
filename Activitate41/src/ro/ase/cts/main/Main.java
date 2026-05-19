package ro.ase.cts.main;

import ro.ase.cts.clase.FacadeTriaj;

public class Main {
    public static void main(String[] args) {
        FacadeTriaj urgenta = new FacadeTriaj();

        urgenta.executaTriajUrgent("Ionescu ", "Pediatrie ");
        urgenta.executaTriajUrgent("Popescu ", "Chirurgie ");
    }
}
