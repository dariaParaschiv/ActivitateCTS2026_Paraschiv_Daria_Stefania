package ro.ase.cts.clase;

public class Papusa extends Jucarie {
    public Papusa(String magazin, int numarPiese) {
        super(magazin, numarPiese);
    }

    @Override
    public void afisareDescriere() {
        System.out.println("Papusa: " + super.toString());
    }
}
