public class BankAccountTest {
    public static void main(String[] args){
        BankAccount account = new BankAccount("user");
        
        account.getcheckingBalance();
        account.getsavingsBalance();

        account.depositChecking(50.00);
        account.depositSavings(1000.00);

        System.out.println(account.getcheckingBalance());

        account.withdrawChecking(10.00);
        // account.withdrawChecking(10);

        // account.withdrawSavings(500);
        account.withdrawSavings(600.00);

        System.out.println("Your checking and Savings total amount is $" + account.statmentTotal());
        System.out.println(account.getname() + " has " + BankAccount.getnumOfAccount() + " account");
    }
}
