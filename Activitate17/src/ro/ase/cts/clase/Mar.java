package ro.ase.cts.clase;

public class Mar extends Fruct{
    public Mar(int gramaj, boolean esteProaspat) {
        super(gramaj, esteProaspat);
    }

    @Override
    public void afisareDescriere() {
        System.out.println("Mar: " + super.toString());
    }
}
