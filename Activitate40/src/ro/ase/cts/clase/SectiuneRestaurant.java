package ro.ase.cts.clase;

import java.util.ArrayList;
import java.util.List;

public class SectiuneRestaurant implements ConsumAbstract {
    private String numeSectiune;
    private List<ConsumAbstract> elementeConsum = new ArrayList<>();

    public SectiuneRestaurant(String numeSectiune) {
        this.numeSectiune = numeSectiune;
    }

    @Override
    public void calculeazaConsum() {
        System.out.println("Sectiunea: " + numeSectiune);
        for(ConsumAbstract consum: elementeConsum) {
            consum.calculeazaConsum();
        }
    }

    @Override
    public void adaugaNod(ConsumAbstract consum){
        elementeConsum.add(consum);
    }

    @Override
    public void stergeNod(ConsumAbstract consum){
        elementeConsum.remove(consum);
    }

    @Override
    public ConsumAbstract getNodCopil(int index){
        if(index >= 0 && index < elementeConsum.size()) {
            return elementeConsum.get(index);
        }
        return null;
    }
}
