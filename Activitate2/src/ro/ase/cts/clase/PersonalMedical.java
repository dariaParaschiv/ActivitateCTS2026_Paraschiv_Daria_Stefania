package ro.ase.cts.clase;

public abstract class PersonalMedical implements PersonalSpital{
    String nume;
    int nrPacienti;

    public PersonalMedical(String nume, int nrPacienti) {
        this.nume = nume;
        this.nrPacienti = nrPacienti;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PersonalMedical{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", nrPacienti=").append(nrPacienti);
        sb.append('}');
        return sb.toString();
    }

    public void afisareDescriere(){

    }
}
