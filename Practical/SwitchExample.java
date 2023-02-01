import java.util.Scanner;

class SwitchExample{
    public void calc_grade(String grade){
        switch(grade){
        case "A":
        System.out.println("Congrats...Your marks is in range of 100-80");
        break;
        
        case "B":
        System.out.println("Great...Your marks is in range of 80-65");
        break;
        
        case "C":
        System.out.println("Your marks is in range of 65-50");
        break;
        
        case "D":
        System.out.println("Your marks is in range of 50-36");
        break;
        
        case "F":
        System.out.println("Failed...Your amrks is below 35");
        break;
        
        default:
        System.out.println("Error... Invalid grade");
        } 
    }
    public static void main(String arsg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter grade: ");
        String grade = sc.next();
        grade = grade.toUpperCase();
        SwitchExample se = new SwitchExample();
        se.calc_grade(grade);
    }
}