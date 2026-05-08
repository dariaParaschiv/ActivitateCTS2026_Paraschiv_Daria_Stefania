package ro.ase.cts.clase;

import java.util.ArrayList;
import java.util.List;

public class CutieCadou extends ElementCadou {
    private List<ElementCadou> listaCadouri = new ArrayList<>();

    public CutieCadou(String nume) {
        super(nume);
    }

    @Override
    public float calculeazaGreutate() {
        float total = 0;
        for(ElementCadou element : listaCadouri) {
            total += element.calculeazaGreutate();
        }
        return total;
    }

    @Override
    public void adauga(ElementCadou element) {
        listaCadouri.add(element);
    }
}
