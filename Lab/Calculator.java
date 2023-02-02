//1. Write a program to design an Calculator using switch case
import java.util.Scanner;

class Calculator{
    
        
    public static void main(String args[]){
        float num1,num2,result;
        String opr;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        num1= sc.nextInt();
        
        System.out.println("Enter the second number: ");
        num2= sc.nextInt();
        
        System.out.println("Enter the symbol of operation you want to perform: ");
        System.out.println("+ for Addition "+"\n"+ "- for Subtraction" +"\n"+ "* for Multiplication " +"\n"+ "/ for Division"+"\n");
        
        opr= sc.next();
        
        
        switch(opr){
            case "+":
            result= num1 + num2;
            System.out.println("Addition: ");
            System.out.println(num1 +" + " +num2 + " = " + result);
            break;
            
            case "-":
            result= num1 + num2;
            System.out.println("Subtraction: ");
            System.out.println(num1 +" - " +num2 + " = " + result);
            break;
            
            case "*":
            result= num1 + num2;
            System.out.println("Multiplication: ");
            System.out.println(num1 +" * " +num2 + " = " + result);
            break;
            
            case "/":
            result= num1 + num2;
            System.out.println("Division: ");
            System.out.println(num1 +" / " +num2 + " = " + result);
            break;
            
            default:
            System.out.println("Please enter a valid symbol...(+,-,*,/)");
        }
    }
    
}