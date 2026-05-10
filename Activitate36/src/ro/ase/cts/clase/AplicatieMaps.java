package ro.ase.cts.clase;

public class AplicatieMaps {
    private StrategieTraseu strategie;

    public void setModTransport(StrategieTraseu strategie) {
        this.strategie = strategie;
    }

    public void afiseazaDrum(int distanta) {
        if(strategie != null) {
            strategie.calculeazaTimp(distanta);
        }
        else{
            System.out.println("Selectati un mod! ");
        }
    }
}
