package ro.ase.cts.clase;

public abstract class Bautura {
    private String descriere;

    public Bautura(String descriere) {
        this.descriere = descriere;
    }

    public String getDescriere() {
        return descriere;
    }

    public abstract float calculeazaPret();
}
