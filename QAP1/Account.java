

public class Account {

    //set veriables for class 
    private String id;
    private String name;
    private int balance = 0;

    //Set only the id and name of the object
   public Account(String id, String name){
        this.id = id;
        this.name = name;
    }

    //Set the id, name, and balance of the object
    public Account(String id, String name, int balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    //Display id
    public String getId(){
        return this.id;
    }

    //Display name
    public String getName(){
        return this.name;
    }

    //Display balance
    public int getBalance() {
        return balance;
    }

    //Add money to the balance
    public int credit(int amount){
        this.balance = this.balance+amount;
        return this.balance;
    }

    //Remove money from the balance
    public int debit(int amount){

        //Enter of the amount removed is not greater then the balance
        if (amount <= this.balance){
            this.balance = this.balance - amount;
        }

        else{
            System.out.println("Amount exceeded balance.");
        }

        return this.balance;
    }

    //Transfer money to another account
    public int transferTo(Account account, int amount){
        //Enter of the amount being transfered is not greater then the balance
        if (amount <= this.balance){
            this.balance = this.balance - amount;

            account.balance = account.balance + amount;
        }

        else{
            System.out.println("Amount exceeded balance.");
        }

        return this.balance;
    }


    //Display information in the object
    public String toString() {
        return ("Account[id = " + this.id + " ,name = " + this.name + " ,balance = " + this.balance + "]");
    }


}
