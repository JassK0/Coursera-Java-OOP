package codeAlong.Banking;
/**
 * Represents a checking/savings bank account for a customer.
 */
public class BankAccount {
   //Instance Variables
   
   //Checking or savings
   String accountType;

   //Balance of this account
   double balance;

   //Customer of this account
   Customer customer;

   //Constructor
   /**
    * creates a bank account of given type for given customer
    * @param accountType for bank account
    * @param customer for bank account
    */
   public BankAccount(String accountType, Customer customer){
    this.accountType = accountType;
    this.customer = customer;


    }
    //Methods
    /**
     * Deposits the given amount.
     * @param amount to add to balance
     */
    public void deposit(double amount){
        this.balance += amount;
    }

    /**
     * Withdraws the given amount from balance, expeption if insufficeint funds.
     * @param amount
     * @throws Exception
     */
    public void withdraw (double amount) throws Exception{//Need "throws Exeption" after the method declare tin order to throw the exeption
        if (amount > this.balance) {
            throw new Exception("Insufficient funds. Withdrawal amount greater than available balnce");
        }
        this.balance -= amount;
    }
    /**
     * returns account type with balance
     * @return string with all the info
     */
    public String getAccountInfo(){
        return this.accountType + ": " + this.balance;
    }
    /**
     * return customer name and address
     * @return string with all the info
     */
    public String getCustomerInfo(){
        return this.customer.getName() + " from " + this.customer.getAddress();
    }


   
}
