package heranca156.aplication;

import heranca156.entities.Account;
import heranca156.entities.BusinessAccount;
import heranca156.entities.SavingsAccount;

public class Program {

    public static void main (String[] args) {

        Account acc1 = new Account(1001, "Alex Green", 1000.0);
        acc1.withDraw(200.0);
        System.out.println(acc1);

        Account acc2 = new SavingsAccount(1002,"Maria Brown",1000.0,0.01);
        acc2.withDraw(200.0);
        System.out.println(acc2);

        Account acc3 = new BusinessAccount(1003, "Bob Mitch", 1000.0,500.0);
        acc3.withDraw(200.0);
        System.out.println(acc3);
    }

}
