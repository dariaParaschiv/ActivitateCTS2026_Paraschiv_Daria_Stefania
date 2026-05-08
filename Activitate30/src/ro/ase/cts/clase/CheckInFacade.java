package ro.ase.cts.clase;

public class CheckInFacade {
    private CompanieAeriana companie;
    private BazaDatePasageri bazaDate;
    private SistemBagaje bagaje;

    public CheckInFacade() {
        this.companie = new CompanieAeriana();
        this.bazaDate = new BazaDatePasageri();
        this.bagaje = new SistemBagaje();
    }

    public void proceseazaCheckIn(String nume, String cod, float greutate){
        System.out.println("-----Incepem procesul----------");

        boolean biletOK = companie.verificareBilet(cod);
        boolean pasagerOK = !bazaDate.estePeListaNeagra(nume);
        boolean bagajOK = bagaje.verificareGreutate(greutate);
        if(biletOK && pasagerOK && bagajOK){
            System.out.println("Imbarcare placuta! ");
        }
        else{
            System.out.println("Verificam datele! ");
        }
    }
}
