package ro.ase.cts.clase;

public class Panou implements PrototypePanou {
    private String layoutGrafic;
    private int inaltime;
    private int latime;
    private String locatie;

    public Panou(String layoutGrafic, int inaltime, int latime, String locatie) {
        if(layoutGrafic.length()>0) {
            this.layoutGrafic = layoutGrafic;
        }
        else{
            this.layoutGrafic = "Standard";
        }
        if(inaltime>0) {
            this.inaltime = inaltime;
        }
        else{
            this.inaltime = 1;
        }
        if(latime>0) {
            this.latime = latime;
        }
        else{
            this.latime = 1;
        }
        if(locatie.length()>0) {
            this.locatie = locatie;
        }
        else{
            this.locatie = "-";
        }
    }

    private Panou(){
    }

    public void setInaltime(int inaltime) {
        this.inaltime = inaltime;
    }

    public void setLatime(int latime) {
        this.latime = latime;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Panou{");
        sb.append("layoutGrafic='").append(layoutGrafic).append('\'');
        sb.append(", inaltime=").append(inaltime);
        sb.append(", latime=").append(latime);
        sb.append(", locatie='").append(locatie).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public PrototypePanou copiaza() {
        Panou panou = new Panou();
        panou.layoutGrafic = this.layoutGrafic;
        panou.inaltime = this.inaltime;
        panou.latime = this.latime;
        panou.locatie = this.locatie;
        return panou;
    }
}
