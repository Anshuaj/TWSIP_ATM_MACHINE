//ATM Machine 
import java.util.*;

public class ATM_MACHINE
{
    public static void main(String args[])
    {
        double CurrentBalance=0,Withdraw,Deposit;
        Scanner sc=new Scanner(System.in);
        
        while(true)
        {
            System.out.println("**********************");
            System.out.println("WELCOME TO ATM MACHINE");
            System.out.println("**********************");
            System.out.println();
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Check Balance");
            System.out.println("Choose 4 for EXIT");
			System.out.println("");
			System.out.print("Enter your choice: ");
            int choice=sc.nextInt();
			System.out.println("");
            switch(choice)
            {
                case 1:
                System.out.println("Enter the amount to withdraw: ");
                Withdraw=sc.nextInt();
                if(CurrentBalance>=Withdraw)
                {
                    CurrentBalance-=Withdraw;
                    System.out.println("Amount has been withdrawn successfully!!");
                    System.out.println("Please collect your money");
                    System.out.println("");
                }
                else
                {
                System.out.println("Unsufficient Balance!!");
                System.out.println("Please Deposit Money to Withdraw");
                System.out.println("");
                }
                break;

                case 2:
                System.out.println("Enter the Amount to Deposit: ");
                Deposit=sc.nextInt();
                CurrentBalance+=Deposit;
                System.out.println("Amount has been Deposited successfully!!");
                System.out.println("");
                break;

                case 3:
                System.out.println("Current Balance: "+CurrentBalance);
                System.out.println("");
                break;

                case 4:
                System.out.println("Thank You for using ATM\nVisit Again!!");
                System.exit(0);
            }

        }
    }
}