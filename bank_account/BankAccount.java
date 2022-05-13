public class BankAccount{
    private double checkingBalance;
    private double savingsBalance;
    private String name;
    
    private static int numOfAccount = 0;
    private static double totalAmount = 0;

    public BankAccount(String name){
        this.name = name;
        this.checkingBalance=0;
        this.savingsBalance=0;
        numOfAccount++;
    }

    // ------------Getter---------------
    public static int getnumOfAccount(){
        return numOfAccount;
    }

    public String getname(){
        return this.name;
    }

    public double getcheckingBalance(){
        return this.checkingBalance;
    }

    public double getsavingsBalance(){
        return this.savingsBalance;
    }

    // ------------Setter---------------
    public static void setnumOfAccount(int newnumOfAccount){
        numOfAccount = newnumOfAccount;
    }

    public void setname(String name){
        this.name = name;
    }

    public void setcheckingBalance(double checkingBalance){
        this.checkingBalance = checkingBalance;
    }
    
    public void setsavingsBalance(double savingsBalance){
        this.savingsBalance = savingsBalance;
    }

    // --------------------------------- 

    public void depositChecking(double checkingBalance){
        this.setcheckingBalance(checkingBalance);
        totalAmount += checkingBalance;
    }

    public void depositSavings(double savingsBalance){
        this.setsavingsBalance(savingsBalance);
        totalAmount += savingsBalance;
    }

    // --------------------------------- 

    public void withdrawChecking(double amount){
        if(getcheckingBalance() < amount){
            System.out.println("Insufficent funds in checking account");
        }
        else{
            setcheckingBalance(getcheckingBalance() - amount);
            System.out.println("Withrawl of $" + amount +" from checking was successful");
        }
    }

    public void withdrawSavings(double amount){
        if(getsavingsBalance() < amount){
            System.out.println("Insufficent funds in savings account");
        }
        else{
            setsavingsBalance(getsavingsBalance() - amount);
            System.out.println("Withrawl of $" + amount +" from savings was successful");
        }
    }

    // --------------------------------- 

    public double statmentTotal(){
        totalAmount = getsavingsBalance() + getcheckingBalance();
        return totalAmount;
    }
}