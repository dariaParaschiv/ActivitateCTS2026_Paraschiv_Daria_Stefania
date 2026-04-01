package ro.ase.cts.clase;

public class Cartof extends Leguma{
    public Cartof(int gramaj, boolean esteProaspat) {
        super(gramaj, esteProaspat);
    }

    @Override
    public void afisareDescriere() {
        System.out.println("Cartof: " + super.toString());
    }
}
