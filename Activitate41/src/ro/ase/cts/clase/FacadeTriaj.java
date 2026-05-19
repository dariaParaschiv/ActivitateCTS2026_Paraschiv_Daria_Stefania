package ro.ase.cts.clase;

public class FacadeTriaj {
    private MedicGarda medicGarda;
    private Salon salon;
    private Registratura registratura;

    public FacadeTriaj() {
        this.medicGarda = new MedicGarda();
        this.salon = new Salon();
        this.registratura = new Registratura();
    }

    public void executaTriajUrgent(String numePacient, String specializareNecesara){
        System.out.println("Incepem procedura! ");
        if(registratura.verificaCardSanatate(numePacient)){
            salon.alocaCameraTriaj(numePacient);
            medicGarda.notificaMedic(specializareNecesara);
            System.out.println("Pacient internat cu succes! ");
        }
        else{
            System.out.println("Card invalid! ");
        }
    }
}
