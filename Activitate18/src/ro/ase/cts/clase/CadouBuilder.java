package ro.ase.cts.clase;

public class CadouBuilder implements ICadou {
    private boolean areFunda;
    private boolean areFelicitare;

    public CadouBuilder() {
        this.areFunda = false;
        this.areFelicitare = false;
    }

    @Override
    public Cadou build() {
        return new Cadou(areFunda, areFelicitare);
    }

    @Override
    public ICadou setAreFunda(boolean areFunda) {
        this.areFunda = areFunda;
        return this;
    }

    @Override
    public ICadou setAreFelicitare(boolean areFelicitare) {
        this.areFelicitare = areFelicitare;
        return this;
    }
}
