package ro.ase.cts.decorator;

import ro.ase.cts.clase.Bautura;

public class DecoratorLapte extends DecoratorIngrediente{
    public DecoratorLapte(Bautura bautura) {
        super(bautura);
    }

    @Override
    public float calculeazaPret() {
        return bauturaDecorata.calculeazaPret() + 2.0f;
    }

    @Override
    public String getDescriere() {
        return bauturaDecorata.getDescriere() + " cu lapte ";
    }
}
