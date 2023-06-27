import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
    private int custmerNumber;
    private int pinNumber;
    private double checkingBalance = 0;
    private double savingBalance = 0;
    Scanner input = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

    public int setCustomerNumber(int custmerNumber){
        this.custmerNumber = custmerNumber;
        return custmerNumber;
    }
    public int getCustomerNumber(){
        return custmerNumber;
    }
    public int setpinNumber(int pinNumber){
        this.pinNumber = pinNumber;
        return pinNumber;
    }
    public int getpinNumber(){
        return pinNumber;
    }
    public double getCheckingBalance(){
        return checkingBalance;
    }
    public double getSavingBalance(){
        return savingBalance;
    }
    public double calCheckingwithdraw( double amount){
        checkingBalance = (checkingBalance - amount);
        return checkingBalance;
    }
    public double calsavingwithdraw( double amount){
        savingBalance = (checkingBalance - amount);
        return savingBalance;
    }
    public double calCheckingDeposit( double amount){
        checkingBalance = (checkingBalance + amount);
        return checkingBalance;
    }
    public double calsavingDeposit( double amount){
        savingBalance = (checkingBalance + amount);
        return savingBalance;
    }
    public void getCheckingWithdrawInput(){
        System.out.println("Checking Account Balance : "+moneyFormat.format(checkingBalance));
        System.out.print("Amount you want to withdraw from Checking Account : ");
        double amount = input.nextDouble();
        if((checkingBalance - amount)>=0){
            calCheckingwithdraw(amount);
            System.out.println("New Checking Account Balance : "+moneyFormat.format(checkingBalance));
        }else{
            System.out.print("In-Sufficent Balance ."+"\n");
        }
    }
    public void getsavingWithdrawInput(){
        System.out.print("Checking Account Balance : "+moneyFormat.format(savingBalance)+"\n");
        System.out.print("Amount you want to withdraw from Checking Account : ");
        double amount = input.nextDouble();
        if((savingBalance - amount)>=0){
            calsavingwithdraw(amount);
            System.out.print("New Checking Account Balance : "+moneyFormat.format(savingBalance)+"\n");
        }else{
            System.out.print("In-Sufficent Balance."+"\n");
        }
    }
    public void getCheckingDepositInput(){
        System.out.println("Checking Account Balance : "+moneyFormat.format(checkingBalance));
        System.out.print("Amount you want to Deposit from Checking Account : ");
        double amount = input.nextDouble();
        if((checkingBalance + amount)>=0){
            calCheckingDeposit(amount);
            System.out.println("New Checking Account Balance : "+moneyFormat.format(checkingBalance));
        }else{
            System.out.print("In-Sufficent Balance."+"\n");
        }
    }
    public void getsavingDepositInput(){
        System.out.println("Checking Account Balance : "+moneyFormat.format(savingBalance));
        System.out.print("Amount you want to Deposit from Checking Account : ");
        double amount = input.nextDouble();
        if((savingBalance + amount)>=0){
            calsavingDeposit(amount);
            System.out.println("New Checking Account Balance : "+moneyFormat.format(savingBalance));
        }else{
            System.out.print("Balance Cannot be Negative."+"\n");
        }
    }



    public static void main(String[] args) {
        
    }
}
