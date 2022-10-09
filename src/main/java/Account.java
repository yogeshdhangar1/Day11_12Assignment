public class Account {
    String accHolName;
    int balance;
    int debitBalance;

    public Account(String accHolName, int balance) {
        this.accHolName = accHolName;
        this.balance = balance;
    }
    public void debitAmt(int debit){
        this.debitBalance = debit;
        if(balance<debitBalance) {
            System.out.println("Debit Amount Exceeded Account Balance  ! ");
        }else {
            int bal = balance-debitBalance;
            bal=balance;
            System.out.println("Remaining balance is :"+balance);
        }
    }

    public static void main(String[] args) {
        Account obj = new Account("Yogesh",50000);
        obj.debitAmt(2000);
    }
}
