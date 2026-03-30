package ro.ase.cts.clase;

public class GestiuneInventar {
    private int stocMedicamente;
    private String adresaDepozit;
    private String numeResponsabil;

    private static GestiuneInventar instanta = null;

    private GestiuneInventar(int stocMedicamente, String adresaDepozit, String numeResponsabil) {
        this.stocMedicamente = stocMedicamente;
        this.adresaDepozit = adresaDepozit;
        this.numeResponsabil = numeResponsabil;
    }

    public static synchronized GestiuneInventar getInstance(int stocMedicamente, String adresaDepozit, String numeResponsabil) {
        if(instanta == null){
            instanta = new GestiuneInventar(stocMedicamente, adresaDepozit, numeResponsabil);
        }
        return instanta;
    }

    public void elibereazaMedicament(int cantitate){
        if(cantitate < 0){
            System.out.println("Cantitatea trebuie sa fie pozitiva!");
        }

        if(cantitate <= this.stocMedicamente){
            this.stocMedicamente -= cantitate;
            System.out.println("Se cer " + cantitate + "bucati");
        }
        else{
            System.out.println("Nu exista stoc!");
        }
    }

    public void afisareDescriere(){
        StringBuilder sb = new StringBuilder();
        sb.append(stocMedicamente);
        sb.append(adresaDepozit);
        sb.append(numeResponsabil);
        System.out.println(sb.toString());
    }
}
