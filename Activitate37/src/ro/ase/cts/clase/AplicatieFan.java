package ro.ase.cts.clase;

public class AplicatieFan implements Fan{
    private String utilizator;

    public AplicatieFan(String utilizator) {
        this.utilizator = utilizator;
    }

    @Override
    public void primesteNotificare(String mesaj) {
        System.out.println("Notificare noua " + utilizator + ": " + mesaj);
    }
}
