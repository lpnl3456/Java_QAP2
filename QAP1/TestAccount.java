

public class TestAccount {
    public static void main(String [] args){

    //Create an account object with $5000 in the balance
    Account Acc1 = new Account("GHT56", "Shane");
    Acc1.credit(5000);

    //Create an account object with $4000 in the balance
    Account Acc2 = new Account("JKE78", "Adam", 4000);

    //Display both balances of the account
    System.out.println(Acc1.getBalance());
    System.out.println(Acc2.getBalance());

    //Transfer $1000 from Acc1 to Acc2
    Acc1.transferTo(Acc2, 1000);

    //Display the new balances
    System.out.println(Acc1.getBalance());
    System.out.println(Acc2.getBalance());
    }
}
