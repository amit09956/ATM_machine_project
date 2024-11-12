
import java.util.Scanner;
 class ATM{

float balance;
int pin=1432;
    @SuppressWarnings("resource")
    public void checkPin(){ 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Pin");
        int Pin=sc.nextInt();
        if(Pin==pin){
            menu();
        }
        else{
            System.out.println("Enter valid Pincode which you are fixed");
            checkPin();
        }
    }
    public void menu(){
        System.out.println("Enter the choices....");
        System.out.println("1.Check Balance");
        System.out.println("2.Withdraw Money");
        System.out.println("3.Deposit Money");
        System.out.println("4.Exit");
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        if(choice==1){
            checkBalance();
        }
        else if(choice==2){
            withdraw();
        }
        else if(choice==3){
            diposit();
        }
        else if(choice==4){
            return;
        }
        else{
            System.out.println("Enter a valid choice");
        }
        
    }
    public void checkBalance(){
        System.out.println("Balance is:"+balance);
        menu();
    }
    @SuppressWarnings("resource")
    public void withdraw(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the withdrawMoney");
        float withdrawMoney=sc.nextInt();
        if(withdrawMoney<=balance){
            
            balance= balance-withdrawMoney;
            System.out.println("Money withdraw successful");
            menu();
        }
        else{
            System.out.println("Enter valid amount");
            menu();
        }
    }
    @SuppressWarnings("resource")
    public void diposit(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the deposit money");
        int Deposit=sc.nextInt();
        balance=balance+Deposit;
        System.out.println("Money is deposit Successfull");
        menu();

    }
}
    public class ProjectATMmachine {
    public static void main (String[]args){
    ATM atm=new ATM();
    atm.checkPin();

}
}

