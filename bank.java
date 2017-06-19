//import java.io.*;
import java.util.*;
/*
 * The program should start with an initial account balance, which you can set to any legitimate double value. 
 * All output of currency values should include a leading dollar sign and use two decimal positions. 
 * Prompt the user with the following prompt (without the dashed lines).

Enter the number of your desired transaction type.
Balance
Withdrawal
Deposit
Quit
If a balance is requested, the program should output "Your current balance is $X.XX" where X.XX is the initial balance,
and then stop.

If a withdrawal is requested, prompt the user to enter the amount of the withdrawal (use a double for this). 
If the proposed withdrawal amount is less than or equal to the initial balance, 
print "Your current balance is $X.XX" where X.XX is the new balance after the withdrawal, and then stop. 
If the proposed withdrawal amount exceeds the initial balance, print "Insufficient funds to withdraw. 
Your current balance is $X.XX" where X.XX is the initial balance, and then stop.

If a deposit is requested, prompt the user to enter the amount of the deposit (use a double for this). 
Add the deposit amount to the initial balance and then print "Your current balance is $X.XX" where X.XX is the 
new balance after the deposit, and then stop.

If "Quit" is requested, the program should print "Now exiting." and then stop.

*/
public class Bank {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double balance = 524.51;
        System.out.println("Enter the number of your desired transaction type.");
        System.out.println("1. Balance");
        System.out.println("2. Withdrawal");
        System.out.println("3. Deposit");
        System.out.println("4. Quit");
        int option = in.nextInt();
        switch (option){
          case 1:
            System.out.println("Your current balance is $" + String.format( "%.2f",balance) );
            break;
          case 2:
            System.out.println("Please enter the amount of the withdrawal");
            double withdrawal = in.nextDouble();
            if (withdrawal <= balance){
              balance = balance - withdrawal;
              System.out.println("Your current balance is $" + String.format( "%.2f",balance));
            } else {
              System.out.println("Insufficient funds to withdraw. Your current balance is $" + String.format( "%.2f",balance));
            }
            break;
          case 3:
            System.out.println("Please enter the amount of the deposit");
            double deposit = in.nextDouble();
            balance = balance + deposit;
            System.out.println("Your current balance is $" + String.format( "%.2f",balance));
            break;
          case 4:
            System.out.println("Now exiting.");
            break;
        }
        in.close();
    }
}
