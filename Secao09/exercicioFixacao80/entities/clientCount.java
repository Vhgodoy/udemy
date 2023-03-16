package exercicioFixacao80.entities;

public class clientCount {

    private final int id ;
    private String name ;
    private double balance ;

    public clientCount(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {return id; }

    public double getBalance() {return balance;}

    public void CreditAccount (double balance) {
        this.balance += balance ;
    }

    public void withdrawalAccount (double withdraw) {
        this.balance = balance - withdraw -  5.0;
    }

    @Override
    public String toString() {
        return "Account "
                + id + ", "
                + "Holder: "
                + name
                + ", "
                + "Balance: " + " $ "
                + String.format("%.2f" , getBalance() );
    }
}
