package ro.ase.cts.clase;

public class Urs extends Jucarie {
    public Urs(String magazin, int numarPiese) {
        super(magazin, numarPiese);
    }

    @Override
    public void afisareDescriere() {
        System.out.println("Urs: " + super.toString());
    }
}
