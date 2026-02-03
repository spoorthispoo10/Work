 class BankAccount
{
    String AccountHolder;
    double Balance;
    int amount;
    BankAccount(String AccountHolder,double Balance){
        this.AccountHolder=AccountHolder;
        this.Balance=Balance;

    }
    void deposit(int amount)
    {
        if(amount==0)
            System.out.println("Invalid Deposit");
        else
           Balance=Balance+amount;  

    }
        void withdraw(int amount)
        {
          if(amount==0)
          System.out.println("Invalid Withdraw");
          else
          Balance=Balance-amount;
         System.out.println("Withdraw Successful");



}

}
class Account
{
    public static void main(String[]args)
    {
        BankAccount b1 = new BankAccount("Spoo",90000);
        b1.deposit(50000);
        b1.withdraw(25000);
        
    

    }
}