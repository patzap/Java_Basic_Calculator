import java.util.Scanner;

public class Main{

    public static void main(String[] args){

       CalcBlurprint User1 = new CalcBlurprint();
       
       Scanner input = new Scanner(System.in);
       System.out.println("Enter the first number");
       User1.num1 = input.nextInt();
    
       System.out.println("Enter the second number");
       User1.num2 = input.nextInt();
      

       do{

            User1.Calculator();

            System.out.println("Do wish to repeat Calculator? Y or N ");
            String end = input.nextLine();

            if (end.equals("Y")){

                User1.Calculator();

            } else {

                input.close();
                break;    

            }
            

       } while(true);
     
  

    }
}