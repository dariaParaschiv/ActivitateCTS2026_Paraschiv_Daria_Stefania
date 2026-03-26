package ro.ase.cts.clase;

public abstract class PersonalSpital {
    private String nume;
    private int varsta;

    public PersonalSpital(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    public abstract void afisareDescriere();

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(" PersonalSpital{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", varsta=").append(varsta);
        sb.append('}');
        return sb.toString();
    }
}
