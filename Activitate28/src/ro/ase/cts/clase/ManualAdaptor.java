package ro.ase.cts.clase;

public class ManualAdaptor extends ManualCurs{
    private EBook eBook;

    public ManualAdaptor(EBook eBook) {
        super(eBook.getNumeAutor());
        this.eBook = eBook;
    }

    @Override
    public void rasfoiestePagini() {
        eBook.scrollOnline();
    }
}
