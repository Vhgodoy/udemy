package entities;

public class E02employee {

    public String Name;
    public double GrossSalary;
    public double Tax;

    public double NetSalary() {
        return GrossSalary - Tax;
    }

    public void IncreaseSalary(double percentage) {
        this.GrossSalary = (GrossSalary / 100 * percentage) + Tax + NetSalary() ;
    }





}


