import java.util.Scanner;

class WhileExample{
    public void calc_table(int number){
        
        int i =1; //initial
        while(i<=10){ //condition
            System.out.println(number + " X " + i + " = " +(number*i));
        i++; //increement
        }
        }
        
    
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = sc.nextInt();
        WhileExample we = new WhileExample();
        we.calc_table(number);
    }
}