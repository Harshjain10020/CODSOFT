import java.util.Scanner;
class Bankacc {
    private double bal ;
    public Bankacc(double bal) {
        this.bal = bal;
    }
    public double getBalance() {
        return bal;
    }
    public void deposit(double amt){
        bal += amt;
    }
    public boolean withdraw(double amt){
        if (amt <= bal) {
            bal -= amt;
            return true;
        }
        else {System.out.println("Gareeb ho ");
            return false;
            
        }
    }
}
public class ATM{
    private Bankacc account ;
    public ATM(Bankacc account){
        this.account = account;
    }
    public void displayMenu(){
        System.out.println("1. Withdraw ");
        System.out.println("2. desposit ");
        System.out.println("3. chk Balance");
        System.out.println("4. bahar");
    }
    public void process(){
        Scanner sc = new Scanner(System.in);
        while(true){
            displayMenu();
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter amount to withdraw ");
                    double amt = sc.nextDouble();
                    if(account.withdraw(amt)){
                        System.out.println("Collect your cash ");
                    }
                    else{
                        System.out.println("Insufficient balance ");}
                        break;
                case 2 :
                    System.out.println("Enter amount to deposit ");
                    double amt1 = sc.nextDouble();
                    account.deposit(amt1);
                    break;
                case 3 :
                    System.out.println("Balance is : " + account.getBalance());
                    break;
                case 4 :
                    System.out.println("Thank you ");
                    System.exit(0);
                    break;
                default :
                    System.out.println("Invalid choice ");
            }
            sc.close();
        }
        
    }

    public static void main(String[] args) {
        Bankacc account = new Bankacc(1000);
        ATM atm = new ATM(account);
        atm.process();
    }
                
} 
