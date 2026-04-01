package ro.ase.cts.clase;

public class Portocala extends Fruct{
    public Portocala(int gramaj, boolean esteProaspat) {
        super(gramaj, esteProaspat);
    }

    @Override
    public void afisareDescriere() {
        System.out.println("Portocala: " + super.toString());
    }
}
