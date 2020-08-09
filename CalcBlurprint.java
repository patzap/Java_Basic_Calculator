import java.util.Scanner;

public class CalcBlurprint {

    double num1;
    double num2;
    double ansNum;

    // Basic Calculator that does add, subtract, multiplication and division
    void Calculator(){

        Scanner input = new Scanner(System.in);
        System.out.println("Choose which operation");
        String operation_choice = input.nextLine();
     
        switch (operation_choice){

            case "+":
                ansNum = num1 + num2;
                System.out.println(ansNum);
                break;
    
            case "-":
                ansNum = num1 - num2;
                System.out.println(ansNum);
                break;
    
            case "*":
                ansNum = num1 * num2;
                System.out.println(ansNum);
                break;
    
            case "/":
                ansNum = num1 / num2;
                System.out.println(ansNum);
                break;

        }

        //input.close();
           
    }
   
}