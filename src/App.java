
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        ATM atm = new ATM();
       Scanner scanner = new Scanner(System.in);
       System.out.println("How can we help you today?\n1.Check Balance\n2.Deposit\n3.Withdrawl\n\nPlease enter the number corresponding with the option.");
       int userInput = Integer.parseInt(scanner.nextLine());

       switch (userInput) {
           case 1 ->{
                atm.checkBalance();
           }
           case 2 ->{
                atm.deposit();
           }
           case 3 ->{
                atm.withdraw();
           }
           default -> {
                System.out.println("Invalid Input!");
                break;
            }
           
       }

    }
}
