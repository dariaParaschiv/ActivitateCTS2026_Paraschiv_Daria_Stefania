package ro.ase.cts.clase;

public class CiocolataCalda extends Bautura{
    public CiocolataCalda(String numeBautura, Double cantitate, String reteta) {
        super(numeBautura, cantitate, reteta);
    }

    @Override
    public void preparareBautura() {
        System.out.println("Lapte, ciocolata, cacao");
    }

    @Override
    public void afisareDescriere() {
        System.out.println("Ciocolata calda: " + super.toString());
    }
}
