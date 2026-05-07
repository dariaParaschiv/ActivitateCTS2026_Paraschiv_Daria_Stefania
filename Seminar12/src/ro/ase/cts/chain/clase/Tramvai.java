package ro.ase.cts.chain.clase;

public class Tramvai extends Urmatorul {
    @Override
    public String recomandareMijlocDeTransport(double distanta) {
        if(distanta < 10){
            return "Tramvai";
        }
        return super.urmatorul.recomandareMijlocDeTransport(distanta);
    }
}
