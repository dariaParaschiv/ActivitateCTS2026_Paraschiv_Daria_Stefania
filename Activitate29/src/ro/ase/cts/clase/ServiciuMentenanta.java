package ro.ase.cts.clase;

public class ServiciuMentenanta {
    private String numeServiciu;
    private int durataOre;

    public ServiciuMentenanta(String numeServiciu, int durataOre) {
        this.numeServiciu = numeServiciu;
        this.durataOre = durataOre;
    }

    public String getNumeServiciu() {
        return numeServiciu;
    }

    public int getDurataOre() {
        return durataOre;
    }

    public void valideazaCodDigital(){
        System.out.println("Serviciul: " + this.numeServiciu + " si durata " + this.durataOre);
    }
}
