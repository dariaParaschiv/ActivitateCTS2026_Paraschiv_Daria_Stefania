package ro.ase.cts.clase;

public class PlataAdaptor extends CardBancar{
    private EWallet eWallet;

    public PlataAdaptor(String numeBanca, String titularCard, EWallet eWallet) {
        super(numeBanca, titularCard);
        this.eWallet = eWallet;
    }

    public PlataAdaptor(String numeBanca, String titularCard, float suma) {
        super(numeBanca, titularCard);
        eWallet.efectueazaPlataOnline(suma);
    }

    @Override
    public void platesteLaTerminal(float suma) {
        this.eWallet.efectueazaPlataOnline(suma);
    }
}
