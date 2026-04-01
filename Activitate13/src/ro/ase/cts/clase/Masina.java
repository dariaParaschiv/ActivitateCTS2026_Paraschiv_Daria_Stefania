package ro.ase.cts.clase;

public class Masina {
    private String numeTitular;
    private String marca;
    private int numarAccidente;
    private int numarDauneMajore;

    private static Masina instanta = null;

    private Masina(String numeTitular, String marca, int numarAccidente, int numarDauneMajore) {
        this.numeTitular = numeTitular;
        this.marca = marca;
        this.numarAccidente = numarAccidente;
        this.numarDauneMajore = numarDauneMajore;
    }

    public static synchronized Masina getInstance(String numeTitular, String marca, int numarAccidente, int numarDauneMajore) {
        if (instanta == null) {
            instanta = new Masina(numeTitular, marca, numarAccidente, numarDauneMajore);
        }
        return instanta;
    }

    public void afisareAsigurare(){
        if(numarDauneMajore == numarAccidente){
            System.out.println("Asigurarea creste!");
        }
        else{
            System.out.println("Asigurarea nu creste!");
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Masina{");
        sb.append("numeTitular='").append(numeTitular).append('\'');
        sb.append(", marca='").append(marca).append('\'');
        sb.append(", numarAccidente=").append(numarAccidente);
        sb.append(", numarDauneMajore=").append(numarDauneMajore);
        sb.append('}');
        return sb.toString();
    }
}
