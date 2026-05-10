package ro.ase.cts.clase;

public abstract class Angajat {
    protected Angajat succesor;

    public void setSuccesor(Angajat succesor) {
        this.succesor = succesor;
    }

    public abstract void aprobaCheltuiala(float suma, String motiv);
}
