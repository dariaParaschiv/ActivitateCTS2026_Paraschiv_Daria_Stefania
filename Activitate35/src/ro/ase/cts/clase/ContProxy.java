package ro.ase.cts.clase;

public class ContProxy implements IContBancar{
    private ContBancar contBancar;
    private String pinCorect = "1234";

    public ContProxy(ContBancar contBancar) {
        this.contBancar = contBancar;
    }

    @Override
    public void retrageBani(int suma) {
        String pinIntrodus = "1234";
        if(pinIntrodus.equals(pinCorect)){
            contBancar.retrageBani(suma);
        }
        else{
            System.out.println("Pin gresit! ");
        }
    }
}
