package ro.ase.cts.clase;

public interface ConsumAbstract {
    void calculeazaConsum();
    void adaugaNod(ConsumAbstract consum) throws Exception;
    void stergeNod(ConsumAbstract consum) throws Exception;
    ConsumAbstract getNodCopil(int index) throws Exception;
}
