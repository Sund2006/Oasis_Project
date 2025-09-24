import java.util.Scanner;

class ATM {
    float Balance;
    int pin = 8953;

    public void checkpin() {
        System.out.println("Enter your pin: ");

        Scanner SC = new Scanner(System.in);
        int enteredpin = SC.nextInt();
        if(enteredpin==pin){
            menu();
        }
        else {
            System.out.println("Enter a valid pin");
        }
    }
    public void menu() {
        System.out.println("Enter your choice");
        System.out.println("1. check A/C number");
        System.out.println("2. withdraw money");
        System.out.println("3. Deposite money");
        System.out.println("4. EXIT");

        Scanner SC = new Scanner(System.in);
        int opt = SC.nextInt();

        if(opt==1) {
            checkBalance();
        }

        else if(opt==2){
             withdrawMoney();
        }

         else if(opt==3){
             depositMoney();
        }

        else if(opt==4) {
            return;
        }
        else {
            System.out.println("Enter avalid choice");
        }
    }
    

    public void checkBalance() {
        System.out.println("Balance: " + Balance);
        menu();
    }
 
    public void withdrawMoney() {
        System.out.println("Enter amount to withdraw: ");
        Scanner SC = new Scanner(System.in);
        float amount = SC.nextFloat();
        if(amount>Balance) {
            System.out.println("Insufficient Balance");
        }
        else {
            Balance = Balance - amount;
            System.out.println("Money Withdraw successful");
        }
        menu();
    }

    public void depositMoney() {
        System.out.println("Enter the amount: ");
        Scanner SC = new Scanner(System.in);
        float amount = SC.nextFloat();
        Balance = Balance + amount;
        System.out.println("Money Deposited successfully");
        menu();
    }
}

public class ATMMachine {
    public static void main(String[] args) {
        ATM obj = new ATM();
        obj.checkpin();
    }
}