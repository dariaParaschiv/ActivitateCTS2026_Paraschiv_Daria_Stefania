package ro.ase.cts.strategy.clase;

public class Student {
    private ModSustinere modSustinere;
    private String nume;

    public void setModSustinere(ModSustinere modSustinere) {
        this.modSustinere = modSustinere;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Student(String nume) {
        this.modSustinere = new Grila();
        this.nume = nume;
    }

    public void examinare(){
        modSustinere.sustinereExamen();
    }
}
