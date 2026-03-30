package ro.ase.cts.clase;

public class LoggerSpital {
    private int numarMesajeLogate;
    private String categorie;

    private LoggerSpital(int numarMesajeLogate, String categorie) {
        this.numarMesajeLogate = numarMesajeLogate;
        this.categorie = categorie;
    }

    private static LoggerSpital instanta = null;

    public static synchronized LoggerSpital getInstance(int numarMesajeLogate, String categorie){
        if(instanta == null){
            instanta = new LoggerSpital(numarMesajeLogate, categorie);
        }
        return instanta;
    }

    public void afisareDescriere(){
        StringBuilder sb = new StringBuilder();
        sb.append(numarMesajeLogate);
        sb.append(categorie);
        System.out.println(sb.toString());
    }

    public void logheazaEveniment(String mesaj){
        this.numarMesajeLogate++;
        StringBuilder sb = new StringBuilder();
        sb.append("Log #");
        sb.append(this.numarMesajeLogate);
        sb.append(": ");
        sb.append(mesaj);

        System.out.println(sb.toString());
    }
}
