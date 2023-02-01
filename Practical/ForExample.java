import java.util.Scanner;

class ForExample{
    public void calc_table(int number){
        for(int i=1;i<=10;i++){
            System.out.println(number + " X " + i + " = " +(number*i));
        }
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = sc.nextInt();
        ForExample fe = new ForExample();
        fe.calc_table(number);
    }
}