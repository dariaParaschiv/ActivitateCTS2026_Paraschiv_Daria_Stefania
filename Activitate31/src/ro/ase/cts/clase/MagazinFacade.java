package ro.ase.cts.clase;

public class MagazinFacade {
    private GestiuneStoc stoc;
    private Fiscul fiscul;
    private ProgramLoialitate loialitate;

    public MagazinFacade() {
        this.stoc = new GestiuneStoc();
        this.fiscul = new Fiscul();
        this.loialitate = new ProgramLoialitate();
    }

    public float calculeazaPretFinal(int idProdus, int idClient){
        float pretBaza = stoc.getPretBaza(idProdus);
        float taxaTVA = pretBaza * fiscul.getCotaTVA(idProdus);
        float discount = loialitate.getDiscountClient(idClient);

        float pretFinal = pretBaza + taxaTVA - discount;

        System.out.println("Calcul: pret " + pretBaza + " + TVA " + taxaTVA + " - discount " + discount);
        return pretFinal;
    }
}
