package ro.ase.cts.decorator;

import ro.ase.cts.clase.Bautura;

public class DecoratorZahar extends DecoratorIngrediente{
    public DecoratorZahar(Bautura bautura) {
        super(bautura);
    }

    @Override
    public float calculeazaPret() {
        return bauturaDecorata.calculeazaPret() + 1.0f;
    }

    @Override
    public String getDescriere() {
        return bauturaDecorata.getDescriere() + " cu zahar ";
    }
}
