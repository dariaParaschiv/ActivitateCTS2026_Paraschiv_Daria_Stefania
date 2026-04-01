package ro.ase.cts.clase;

public class SalataBuilder implements ISalata{
    private boolean areRosii;
    private boolean areCastraveti;

    public SalataBuilder() {
        this.areRosii = false;
        this.areCastraveti = false;
    }

    @Override
    public Salata build() {
        return new Salata(areRosii, areCastraveti);
    }

    @Override
    public ISalata setAreRosii(boolean areRosii) {
        this.areRosii = areRosii;
        return this;
    }

    @Override
    public ISalata setAreCastraveti(boolean areCastraveti) {
        this.areCastraveti = areCastraveti;
        return this;
    }
}
