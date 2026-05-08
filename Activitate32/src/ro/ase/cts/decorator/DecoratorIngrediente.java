package ro.ase.cts.decorator;

import ro.ase.cts.clase.Bautura;

public abstract class DecoratorIngrediente extends Bautura {
    protected Bautura bauturaDecorata;

    public DecoratorIngrediente(Bautura bautura) {
        super(bautura.getDescriere());
        this.bauturaDecorata = bautura;
    }

    @Override
    public abstract float calculeazaPret();
}
