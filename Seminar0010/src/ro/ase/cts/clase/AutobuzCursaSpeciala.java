package ro.ase.cts.clase;

public class AutobuzCursaSpeciala implements MijlocTransport{
    private MijlocTransport mijlocTransport;

    public AutobuzCursaSpeciala(MijlocTransport mijlocTransport) {
        this.mijlocTransport = mijlocTransport;
    }

    @Override
    public void opresteInStatie() {
        if(mijlocTransport.getLinie().toLowerCase().contains("special")){
            System.out.println("Autobuzul este in cursa speciala! ");
        }
        else{
            mijlocTransport.opresteInStatie();
        }
    }

    @Override
    public int getNrCalatori() {
        return mijlocTransport.getNrCalatori();
    }

    @Override
    public String getLinie() {
        return mijlocTransport.getLinie();
    }
}
