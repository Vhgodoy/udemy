package ExercicioFixacao165.entities;

public class Individual extends TaxPayer {
    private double healthExpenses;

    public Individual (){}

    public Individual(double healthExpenses) {
        this.healthExpenses = healthExpenses;
    }

    public Individual(String name, double annualIncome, double healthExpenses) {
        super(name, annualIncome);
        this.healthExpenses = healthExpenses;
    }

    public double getHealthExpenses() {
        return healthExpenses;
    }

    @Override
    public double tax() {
        double totalTax = getAnnualIncome() - (healthExpenses / 100 * 50);
        double individualTax = 0.0;
        if ( totalTax <= 20000.00) {
            individualTax = totalTax / 100 * 15;
        } else {
            individualTax = totalTax / 100 * 25;
        }
        return individualTax;
    }
}
