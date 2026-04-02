package ro.ase.cts.clase;

public class FelMancare implements FelMancarePrototype {
    private String denumire;
    private int ingrediente;

    public FelMancare(String denumire, int ingrediente) {
        this.denumire = denumire;
        this.ingrediente = ingrediente;
    }

    private FelMancare() {}

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public void setIngrediente(int ingrediente) {
        this.ingrediente = ingrediente;
    }

    @Override
    public FelMancare copiaza() {
        FelMancare felMancare = new FelMancare();
        felMancare.denumire = denumire;
        felMancare.ingrediente = ingrediente;
        return felMancare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("FelMancare{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", ingrediente=").append(ingrediente);
        sb.append('}');
        return sb.toString();
    }
}
