package ro.ase.cts.clase;

public class Medicament implements IPrototypeMedicament{
    private String nume;
    private String descriere;
    private int gramaj;

    public Medicament(String nume, String descriere, int gramaj) {
        this.nume = nume;
        this.descriere = descriere;
        this.gramaj = gramaj;
    }

    private Medicament() {}

    @Override
    public IPrototypeMedicament copiaza() {
        Medicament medicament = new Medicament();
        medicament.nume = nume;
        medicament.descriere = descriere;
        medicament.gramaj = gramaj;
        return medicament;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Medicament{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", descriere='").append(descriere).append('\'');
        sb.append(", gramaj=").append(gramaj);
        sb.append('}');
        return sb.toString();
    }
}
