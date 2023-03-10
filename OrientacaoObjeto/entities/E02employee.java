package entities;

public class E02employee {

    public String  Name;
    public double GrossSalary;
    public double Tax;

    public double NetSalary() {
        return GrossSalary - Tax;
    }
}


