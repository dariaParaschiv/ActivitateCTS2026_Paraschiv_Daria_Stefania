package ro.ase.cts.clase;

public class Spital {
    private Medic medic;
    private Salon salon;


    public Spital(Medic medic, Salon salon) {
        this.medic = medic;
        this.salon = salon;
    }

    public void internarePacient(Pacient pacient){
        if(pacient.getGravitate() > 4) {
            if(medic.areInregistratPacientul(pacient)){
                int patLiber = salon.getPaturiLibere();
                if(patLiber != -1){
                    System.out.println("Pacientul: " + pacient.getNume() + " este internat in patul " + patLiber);
                    salon.ocupaPat(patLiber);
                }
                else{
                    System.out.println("Nu sunt paturi libere!");
                }
            }else{
                System.out.println("Trebuie trimitere de la medic!");
            }
        }else{
            System.out.println("Pacientul nu este atat de grav!");
        }
    }
}
