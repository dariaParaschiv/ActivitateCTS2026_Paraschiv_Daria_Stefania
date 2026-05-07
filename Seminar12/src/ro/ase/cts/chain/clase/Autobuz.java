package ro.ase.cts.chain.clase;

public class Autobuz extends Urmatorul {
    @Override
    public String recomandareMijlocDeTransport(double distanta) {
        if(distanta < 5){
            return "Autobuz ";
        }

        return super.urmatorul.recomandareMijlocDeTransport(distanta);
    }
}
