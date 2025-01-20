package Level1;

public class BankAccount {
    static String bankName;
     String accountHolderName;
    final int accountNumber;
    static int totalAccount=0;
    BankAccount(String bankName,String accountHolderName,int accountNumber){
        this.bankName=bankName;
        this.accountHolderName=accountHolderName;
        this.accountNumber=accountNumber;
        totalAccount++;
    }

     static int  getTotalAccounts(){
        return totalAccount;
    }
    void display() {
        if (this instanceof BankAccount) {
            System.out.println("Bank Name : " + bankName);
            System.out.println("Account Holder Name : " + accountHolderName);
            System.out.println("Account Number : " + accountNumber);
        }
    }

    public static void main(String[] args) {
        BankAccount bankAccount=new BankAccount("SBI","MOHAN",3811299);
        bankAccount.display();
        System.out.println(getTotalAccounts());

    }
}
