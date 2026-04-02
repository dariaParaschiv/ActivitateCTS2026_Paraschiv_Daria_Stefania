package ro.ase.cts.clase;

public class Telefon {
    private static Telefon instanta = null;

    private String numePosesor;
    private String marca;
    private int numarAplicatii;
    private int memorie;

    private Telefon(String numePosesor, String marca, int numarAplicatii, int memorie) {
        this.numePosesor = numePosesor;
        this.marca = marca;
        this.numarAplicatii = numarAplicatii;
        this.memorie = memorie;
    }

    public static synchronized Telefon getInstance(String numePosesor, String marca, int numarAplicatii, int memorie) {
        if(instanta == null) {
            instanta = new Telefon(numePosesor, marca, numarAplicatii, memorie);
        }
        return instanta;
    }

    public void afisareMemorie(int memorieDisponibila){
        numarAplicatii++;
        if(memorieDisponibila < this.memorie){
            System.out.println("Aplicatia a fost instalata! ");
        }
        else{
            System.out.println("Aplicatia nu a fost instalata! ");
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Telefon{");
        sb.append("numePosesor='").append(numePosesor).append('\'');
        sb.append(", marca='").append(marca).append('\'');
        sb.append(", numarAplicatii=").append(numarAplicatii);
        sb.append(", memorie=").append(memorie);
        sb.append('}');
        return sb.toString();
    }
}
