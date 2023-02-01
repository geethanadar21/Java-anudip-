import java.util.Scanner;

class Switch{
    public void calc_day(int sum){
        switch(sum){              //switch(expression)
        case 1:
        System.out.println("Monday");
        break;
        
        case 2:
        System.out.println("Tuesday");
        break;
        
        case 3:
        System.out.println("Wednesday");
        break;
        
        case 4:
        System.out.println("Thursday");
        break;
        
        case 5:
        System.out.println("Friday");
        break;
        
        case 6:
        System.out.println("Saturday");
        break;
        
        case 7:
        System.out.println("Sunday");
        break;
        
        default:
        System.out.println("Please enter small numbers (between 1-3)");
        } 
    }
    public static void main(String arsg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter number2: ");
        int num2 = sc.nextInt();
        
        int sum = num1+num2;
        Switch se = new Switch();
        se.calc_day(sum);
    }
}