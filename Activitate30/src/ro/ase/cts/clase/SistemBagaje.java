package ro.ase.cts.clase;

public class SistemBagaje {
    public boolean verificareGreutate(float greutate){
        if(greutate > 30){
            System.out.println("Bagaj prea greu! ");
            return false;
        }
        return true;
    }
}
