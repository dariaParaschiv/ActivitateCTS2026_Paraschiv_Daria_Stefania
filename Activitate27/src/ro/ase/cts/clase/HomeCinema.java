package ro.ase.cts.clase;

public class HomeCinema {
    private Audio audio;
    private Ecran ecran;
    private Lumina lumina;
    private Proiector proiector;

    public HomeCinema() {
        this.audio = new Audio();
        this.ecran = new Ecran();
        this.lumina = new Lumina();
        this.proiector = new Proiector();
    }

    public void incepeFilmul(){
        System.out.println("Pregatim sala pentru film. ");
        lumina.setIntensitate(20);
        ecran.coboara();
        proiector.porneste();
        proiector.setInput("HDMI ");
        audio.porneste();
        audio.setVolum(70);
        System.out.println("Vizionare placuta! ");
    }

    public void opresteFilmul(){
        System.out.println("Inchidem sistemul cinema. ");
        audio.opreste();
        proiector.opreste();
        ecran.ridica();
        lumina.setIntensitate(100);
        System.out.println("Gata! ");
    }
}
