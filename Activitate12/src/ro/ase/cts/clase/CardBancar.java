package ro.ase.cts.clase;

public class CardBancar {
    private String numeTitular;
    private String numarCard;
    private int soldDisponibil;
    private int soldTranzactionat;

    private static CardBancar instanta = null;

    private CardBancar(String numeTitular, String numarCard, int soldDisponibil, int soldTranzactionat) {
        this.numeTitular = numeTitular;
        this.numarCard = numarCard;
        this.soldDisponibil = soldDisponibil;
        this.soldTranzactionat = soldTranzactionat;
    }

    public static synchronized CardBancar getInstance(String numeTitular, String numarCard, int soldDisponibil, int soldTranzactionat) {
        if(instanta == null){
            instanta = new CardBancar(numeTitular, numarCard, soldDisponibil, soldTranzactionat);
        }
        return instanta;
    }

    public void afisareTranzactie() {
        if(soldTranzactionat <= soldDisponibil){
            System.out.println("Tranzactie realizata cu succes!");
        }
        else{
            System.out.println("Tranzactie nu a fost realizata cu succes!");
        }

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CardBancar{");
        sb.append("numeTitular='").append(numeTitular).append('\'');
        sb.append(", numarCard='").append(numarCard).append('\'');
        sb.append(", soldDisponibil=").append(soldDisponibil);
        sb.append(", soldTranzactionat=").append(soldTranzactionat);
        sb.append('}');
        return sb.toString();
    }
}
