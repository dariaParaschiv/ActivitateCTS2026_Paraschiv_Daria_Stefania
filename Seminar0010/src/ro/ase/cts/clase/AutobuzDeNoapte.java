package ro.ase.cts.clase;

public class AutobuzDeNoapte implements MijlocTransport {
    private MijlocTransport mijlocTransport;

    public AutobuzDeNoapte(MijlocTransport mijlocTransport) {
        this.mijlocTransport = mijlocTransport;
    }

    @Override
    public int getNrCalatori() {
        return mijlocTransport.getNrCalatori();
    }

    @Override
    public String getLinie() {
        return mijlocTransport.getLinie();
    }

    @Override
    public void opresteInStatie() {
        if(mijlocTransport.getNrCalatori() > 0){
            mijlocTransport.opresteInStatie();
        }
        else{
            System.out.println("Autozul se retrage! ");
        }
    }
}
