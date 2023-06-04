package entities;

public class aluno {

    public String name;
    public double firstNote;
    public double secondNote;
    public double finalNote;


    public aluno (String name, double nota1, double nota2) {
        this.name = name;
        this.firstNote = nota1;
        this.secondNote = nota2;
    }
    public aluno ( String name) {
        this.name = name;
    }
    public aluno (double nota1, double nota2) {
        this.firstNote = nota1;
        this.secondNote = nota2;
    }
    public double notaf (int semestre) {
        return (this.firstNote + this.secondNote) / semestre;
    }

    public String toString() {
        return name +
                " " +
                firstNote +
                " " +
                secondNote ;
    }
}
