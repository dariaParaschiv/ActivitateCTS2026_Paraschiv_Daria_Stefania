package ro.ase.cts.chain.clase;

public class Troleibuz extends Urmatorul{
    @Override
    public String recomandareMijlocDeTransport(double distanta) {
        if(distanta < 3){
            return "Troleibuz ";
        }
        return super.urmatorul.recomandareMijlocDeTransport(distanta);
    }
}
