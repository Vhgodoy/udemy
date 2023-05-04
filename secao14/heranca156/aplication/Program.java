package heranca156.aplication;

import heranca156.entities.BusinessAccount;

public class Program {

    public static void main (String[] args) {

        BusinessAccount account = new BusinessAccount();

        account.setHolder("joao");


        System.out.println(account);
    }
}
