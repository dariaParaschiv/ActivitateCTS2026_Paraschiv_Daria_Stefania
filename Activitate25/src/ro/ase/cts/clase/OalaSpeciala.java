package ro.ase.cts.clase;

public class OalaSpeciala {
    private String numeUstensila;
    private int vechimeAni;

    public OalaSpeciala(String numeUstensila, int vechimeAni) {
        this.numeUstensila = numeUstensila;
        this.vechimeAni = vechimeAni;
    }

    public String getNumeUstensila() {
        return numeUstensila;
    }

    public int getVechimeAni() {
        return vechimeAni;
    }

    public void incalzesteLaFocDeschis(){
        System.out.println("Ustensila " + this.numeUstensila + " (vechi de " + this.vechimeAni + " ani) se incalzeste doar la flacara. ");
    }
}
