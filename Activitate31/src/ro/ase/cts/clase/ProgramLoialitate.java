package ro.ase.cts.clase;

public class ProgramLoialitate {
    public float getDiscountClient(int idClient){
        if(idClient == 1) {
            return 10.0f;
        }
        else {
            return 0.0f;
        }
    }
}
