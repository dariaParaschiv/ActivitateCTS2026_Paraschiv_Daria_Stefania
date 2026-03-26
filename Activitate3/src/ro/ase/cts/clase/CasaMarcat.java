package ro.ase.cts.clase;

public class CasaMarcat {
    private float sumaTotala;
    private int idCasa;
    private int numarBonuriEmise;

    private static CasaMarcat instanta = null;

    private CasaMarcat(float sumaTotala, int idCasa, int numarBonuriEmise) {
        this.sumaTotala = sumaTotala;
        this.idCasa = idCasa;
        this.numarBonuriEmise = numarBonuriEmise;
    }

    public static synchronized CasaMarcat getInstance(float sumaTotala, int idCasa, int numarBonuriEmise) {
        if(instanta == null){
            instanta = new CasaMarcat(sumaTotala, idCasa, numarBonuriEmise);
        }
        return instanta;
    }

    public void inregistreazaVanzare(float suma){
        if(suma > 0){
            this.sumaTotala += suma;
            this.numarBonuriEmise ++;
        }
        else{
            System.out.println("Suma nu este valida!");
        }
    }

    public void afisareRaportZilnic(){
        StringBuilder raport = new StringBuilder();
        raport.append("-----Raport zilnic ")
                .append(idCasa)
                .append("-----\n")
                .append("Numar tranzactii: ")
                .append(numarBonuriEmise)
                .append(" Total incasat: ")
                .append(sumaTotala);
        System.out.println(raport.toString());
    }

    public float getSumaTotala() {
        return sumaTotala;
    }
}
