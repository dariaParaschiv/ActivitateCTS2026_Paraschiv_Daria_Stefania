package ro.ase.cts.clase;

public class Ceai extends Bautura{
    public Ceai(String numeBautura, Double cantitate, String reteta) {
        super(numeBautura, cantitate, reteta);
    }

    @Override
    public void preparareBautura() {
        System.out.println("Apa fierbinte, pliculet de ceai");
    }

    @Override
    public void afisareDescriere() {
        System.out.println("Ceai: " + super.toString());
    }
}
