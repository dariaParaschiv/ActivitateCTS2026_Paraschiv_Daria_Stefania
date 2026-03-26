package ro.ase.cts.clase;

public abstract class PersonalNonMedical implements PersonalSpital{
    String nume;
    int nrPacienti;
    int nrAngajati;

    public PersonalNonMedical(String nume, int nrPacienti, int nrAngajati) {
        this.nume = nume;
        this.nrPacienti = nrPacienti;
        this.nrAngajati = nrAngajati;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PersonalNonMedical{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", nrPacienti=").append(nrPacienti);
        sb.append(", nrAngajati=").append(nrAngajati);
        sb.append('}');
        return sb.toString();
    }

    public void afisareDescriere(){

    }
}
