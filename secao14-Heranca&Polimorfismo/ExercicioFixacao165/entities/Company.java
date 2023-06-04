package ExercicioFixacao165.entities;

public class Company extends TaxPayer {

    private int numberOfEmployee;

    public Company() {
    }

    public Company(int numberOfEmployee) {
        this.numberOfEmployee = numberOfEmployee;
    }

    public Company(String name, double annualIncome, int numberOfEmployee) {
        super(name, annualIncome);
        this.numberOfEmployee = numberOfEmployee;
    }

    public int getNumberOfEmployee() {
        return numberOfEmployee;
    }

    public void setNumberOfEmployee(int numberOfEmployee) {
        this.numberOfEmployee = numberOfEmployee;
    }

    @Override
    public double tax() {
        double companyTax = 0.0;
        if (numberOfEmployee <= 10) {
            companyTax = getAnnualIncome() / 100 * 16;
        } else {
            companyTax = getAnnualIncome() / 100 * 14;
        }
        return companyTax;
    }
}