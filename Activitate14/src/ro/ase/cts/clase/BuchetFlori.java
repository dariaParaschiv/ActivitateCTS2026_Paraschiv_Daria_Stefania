package ro.ase.cts.clase;

public class BuchetFlori {
    private String tipEveniment;
    private int nrFlori;
    private String culoare;

    public BuchetFlori(String tipEveniment, int nrFlori, String culoare) {
        this.tipEveniment = tipEveniment;
        this.nrFlori = nrFlori;
        this.culoare = culoare;
    }

    public void setTipEveniment(String tipEveniment) {
        this.tipEveniment = tipEveniment;
    }

    public void setNrFlori(int nrFlori) {
        this.nrFlori = nrFlori;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BuchetFlori{");
        sb.append("tipEveniment='").append(tipEveniment).append('\'');
        sb.append(", nrFlori=").append(nrFlori);
        sb.append(", culoare='").append(culoare).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
