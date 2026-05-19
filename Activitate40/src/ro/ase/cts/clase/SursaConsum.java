package ro.ase.cts.clase;

public class SursaConsum implements ConsumAbstract {
    private String nume;
    private float consumKwh;

    public SursaConsum(String nume, float consumKwh) {
        this.nume = nume;
        this.consumKwh = consumKwh;
    }

    @Override
    public void calculeazaConsum() {
        System.out.println("Aparatul " + nume + " consum: " + consumKwh + " kwh.");
    }

    @Override
    public void adaugaNod(ConsumAbstract consum) throws Exception {
        throw new Exception("Nu se poate adauga nod. ");
    }

    @Override
    public void stergeNod(ConsumAbstract consum) throws Exception {
        throw new Exception("Nu se poate sterge nod. ");
    }

    @Override
    public ConsumAbstract getNodCopil(int index) throws Exception {
        throw new Exception("Frunza nu are copii de returnat. ");
    }
}
