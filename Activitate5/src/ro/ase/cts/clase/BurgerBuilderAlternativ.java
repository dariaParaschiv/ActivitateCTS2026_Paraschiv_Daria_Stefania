package ro.ase.cts.clase;

public class BurgerBuilderAlternativ implements BurgerBuilderAbstractAlternativ{
    private String chifla;
    private String carne;
    private String sos;
    private boolean areSalata;
    private boolean areBacon;

    public BurgerBuilderAlternativ() {
        this.chifla = "Fara chifla";
        this.carne = "Fara carne";
        this.sos = "Fara sos";
        this.areSalata = false;
        this.areBacon = false;
    }

    public BurgerBuilderAlternativ setChifla(String chifla) {
        this.chifla = chifla;
        return this;
    }

    public BurgerBuilderAlternativ setCarne(String carne) {
        this.carne = carne;
        return this;
    }

    public BurgerBuilderAlternativ setSos(String sos) {
        this.sos = sos;
        return this;
    }

    public BurgerBuilderAlternativ setAreSalata(boolean areSalata) {
        this.areSalata = areSalata;
        return this;
    }

    public BurgerBuilderAlternativ setAreBacon(boolean areBacon) {
        this.areBacon = areBacon;
        return this;
    }

    @Override
    public Burger build(String chifla, String carne) {
        Burger burger = new Burger(chifla, carne, this.sos, this.areSalata, this.areBacon);
        return burger;
    }
}
