package ro.ase.cts.clase;

public class BurgerBuilder implements BurgerBuilderAbstract{
    private Burger burger;

    public BurgerBuilder(String chifla, String carne) {this.burger = new Burger(chifla, carne, "Fara sos", false, false);}

    public BurgerBuilder setChifla(String chifla) {
        burger.chifla = chifla;
        return this;
    }

    public BurgerBuilder setCarne(String carne) {
        burger.carne = carne;
        return this;
    }

    public BurgerBuilder setSos(String sos) {
        burger.sos = sos;
        return this;
    }

    public BurgerBuilder setAreSalata(boolean areSalata) {
        burger.areSalata = areSalata;
        return this;
    }

    public BurgerBuilder setAreBacon(boolean areBacon) {
        burger.areBacon = areBacon;
        return this;
    }

    @Override
    public Burger build() {
        return burger;
    }
}
