 import java.io.IOException;
 import java.text.DecimalFormat;
 import java.util.*;
public class OptionMenu extends Account{
    Scanner menuInput = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
    HashMap<Integer ,Integer> data = new HashMap<Integer,Integer>();
    public void getLogin() throws IOException{

        int x = 1;
        do{
            try{
                data.put(952141,191904);
                data.put(989947,71976);
                data.put(9501795,71456);

                System.out.println("Welcome to the ATM Project ! ");
                System.out.print("Enter your Customer Number : ");
                setCustomerNumber(menuInput.nextInt());

                System.out.print("Enter your PIN Number : ");
                setpinNumber(menuInput.nextInt());

            }catch(Exception e){
                System.out.println("\n "+ " INvalid Character(s). Only NUMbers."+"\n");
                x = 2;
            }
            
            int cn = getCustomerNumber();
            int pn = getpinNumber();
            if(data.containsKey(cn)&& data.get(cn)== pn){
                getAccountType();
            }else{
                System.out.println("\n"+"Wrong Cunster Number or Pin Number "+"\n");
            }
      
        }while(x==1);
    }
    public void getAccountType(){
        System.out.println("Select the Account you Want to Access: ");
        System.out.println("Type 1 : Checking Account ");
        System.out.println("Type 2 : Saving  Account ");
        System.out.println("Type 3 : Exit ");
        int Selection = menuInput.nextInt();
        switch(Selection){
            case 1 : {
                getChecking();
                break;
            }
            case 2 : {
                getSaving();
                break;
            }
            case 3 : {
                System.out.println("Thank you for using this ATM, bye .\n");
                break;
            }
            default : {
                System.out.println("\n"+" Invalid Choice "+"\n");
            }
        }
    }

    public void getChecking(){
        System.out.println("Checking Account : ");
        System.out.println("Type 1 : View Balance ");
        System.out.println("Type 2 : Withdraw funds ");
        System.out.println("Type 3 : Deposit Funds ");
        System.out.println("Type 4 : Exit ");
        System.out.println("Choice : ");
        int Selection = menuInput.nextInt();
        switch(Selection){
            case 1 : {
                System.out.println("Checking Account Balance : "+ moneyFormat.format(getCheckingBalance())+"\n");

            }
            case 2 : {
                getCheckingWithdrawInput();
                getAccountType();
                break;
            }
            case 3:{
                getCheckingDepositInput();
                getAccountType();
                break;
            }
            case 4 : {
                System.out.println("Thank you for using this ATM, bye .\n");
            }
            default:{
                System.out.println("\n"+" Invalid Choice "+"\n");
            }
        }
    }
    public void getSaving(){
        System.out.println("Saving Account : ");
        System.out.println("Type 1 : View Balance ");
        System.out.println("Type 2 : Withdraw funds ");
        System.out.println("Type 3 : Deposit Funds ");
        System.out.println("Type 4 : Exit ");
        System.out.println("Choice : ");
        int Selection = menuInput.nextInt();
        switch(Selection){
            case 1 : {
                System.out.println("Saving Account Balance : "+ moneyFormat.format(getSavingBalance()));

            }
            case 2 : {
                getsavingWithdrawInput();
                getAccountType();
                break;
            }
            case 3:{
                getsavingDepositInput();
                getAccountType();
                break;
            }
            case 4 : {
                System.out.println("Thank you for using this ATM, bye .\n");
            }
            default:{
                System.out.println("\n"+" Invalid Choice "+"\n");
            }
        }
    }
    public static void main(String[] args) {
        
    }
}
