package ro.ase.cts.clase;

public class Cafea extends Bautura{
    public Cafea(String numeBautura, Double cantitate, String reteta) {
        super(numeBautura, cantitate, reteta);
    }

    @Override
    public void preparareBautura() {
        System.out.println("Apa fierbinte, cafea macinata, lapte");
    }

    @Override
    public void afisareDescriere() {
        System.out.println("Cafea: " + super.toString());
    }
}
