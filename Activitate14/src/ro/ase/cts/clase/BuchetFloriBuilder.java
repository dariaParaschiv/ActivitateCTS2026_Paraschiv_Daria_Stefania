package ro.ase.cts.clase;

public class BuchetFloriBuilder implements IBuilder{

    private String tipEveniment = "Zi de nastere";
    private int nrFlori = 5;
    private String culoare = "Zi de nastere";

    public BuchetFloriBuilder setTipEveniment(String tipEveniment) {
        this.tipEveniment = tipEveniment;
        return this;
    }

    public BuchetFloriBuilder setNrFlori(int nrFlori) {
        this.nrFlori = nrFlori;
        return this;
    }

    public BuchetFloriBuilder setCuloare(String culoare) {
        this.culoare = culoare;
        return this;
    }

    public BuchetFlori build() {
        return new BuchetFlori(tipEveniment, nrFlori, culoare);
    }
}
