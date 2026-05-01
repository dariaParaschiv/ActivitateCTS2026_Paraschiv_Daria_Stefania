package ro.ase.cts.clase;

public class CardBancar {
    private String numeBanca;
    private String titularCard;

    public CardBancar(String numeBanca, String titularCard) {
        this.numeBanca = numeBanca;
        this.titularCard = titularCard;
    }

    public void platesteLaTerminal(float suma){
        System.out.println("Titularul: " + this.titularCard + " a platit cu cardul suma de: " + suma);
    }
}
