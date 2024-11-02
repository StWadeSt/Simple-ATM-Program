
import java.util.Scanner;


public class ATM {
    Scanner scanner = new Scanner(System.in);
    BankAccount myAccount = new BankAccount();
    
       public void checkBalance(){
        System.out.println("Current balance:\tR"+ (handleBalanceCheck()));
    }
    public void withdraw(){
        int currentBalance = handleBalanceCheck();
        
        String exit = "";
        int withdrawlAmount=1;
        while(withdrawlAmount != 0){
                System.out.print("Enter 0 to exit.\nHow much do you wish to withdraw:\t");
                withdrawlAmount = Integer.parseInt(scanner.nextLine());
                if(withdrawlAmount > currentBalance){
                    System.out.println("You have insufficient funds. Please try again");
                }
                else if (withdrawlAmount<50) {
                    System.out.println("You can only draw amount bigger than R50. Please try again");
                }
                else{
                    myAccount.updateBalance((currentBalance - withdrawlAmount));
                    System.out.println("Transaction Successfull!");
                    break;
                }
        
        }

        checkBalance();

    }
    public void deposit(){
        int currentBalance = handleBalanceCheck();
        System.out.print("How much do you wish to deposit:\t");
        int depositAmount = Integer.parseInt(scanner.nextLine());

        myAccount.updateBalance( (currentBalance + depositAmount));
        System.out.println("Transaction Successfull!");
        checkBalance();
    }

    int handleBalanceCheck(){
        return myAccount.getBalance();
    }
}
