package ro.ase.cts.clase;

public class MeciFotbal extends SubiectMeci{
    private String echipa1;
    private String echipa2;
    private int scorEchipa1 = 0;
    private int scorEchipa2 = 0;

    public MeciFotbal(String echipa1, String echipa2) {
        this.echipa1 = echipa1;
        this.echipa2 = echipa2;
    }

    public void inscrieGol(String echipa){
        if(echipa.equals(echipa1)){
            scorEchipa1++;
        }
        else{
            scorEchipa2++;
        }

        System.out.println("------ GOL " + echipa + " ------");

        String scorActualizat = echipa1 + " " + scorEchipa1 + " - " + scorEchipa2 + " " + echipa2;
        super.notifica("Scor nou: " + scorActualizat);
    }
}
