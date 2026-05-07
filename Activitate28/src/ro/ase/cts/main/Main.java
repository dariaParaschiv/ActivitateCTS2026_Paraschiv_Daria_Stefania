package ro.ase.cts.main;

import ro.ase.cts.clase.EBook;
import ro.ase.cts.clase.ManualAdaptor;
import ro.ase.cts.clase.ManualCurs;

public class Main {
    public static void validareManual(ManualCurs manual){
        manual.rasfoiestePagini();
    }
    public static void main(String[] args) {
        ManualCurs manualCurs = new ManualCurs("CTS ");
        EBook eBook = new EBook("Daria ");
        ManualAdaptor manualAdaptor = new ManualAdaptor(eBook);

        validareManual(manualCurs);
        validareManual(manualAdaptor);
    }
}
