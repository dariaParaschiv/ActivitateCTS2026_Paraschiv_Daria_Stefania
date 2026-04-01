package ro.ase.cts.clase;

public class Morcov extends Leguma{
    public Morcov(int gramaj, boolean esteProaspat) {
        super(gramaj, esteProaspat);
    }

    @Override
    public void afisareDescriere() {
        System.out.println("Morcov: " + super.toString());
    }
}
