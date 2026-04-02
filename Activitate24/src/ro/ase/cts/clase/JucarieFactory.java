package ro.ase.cts.clase;

public class JucarieFactory {
    public Jucarie getJucarie(String magazin, int numarPiese, JucarieType tip){
        return switch(tip){
            case JucarieType.Urs -> new Urs(magazin, numarPiese);
            case JucarieType.Papusa -> new Papusa(magazin, numarPiese);
            default -> null;
        };
    }
}
