import java.util.Scanner;
class MultipleIf{

           public void  clac(int age,int weight){
           
           if(age>=18){
              if(weight>50){
                    System.out.println("You are eligible to donate blood");
                 }
               else{
                   System.out.println("You are not eligible to donate blood");
                  }
           }
          else{
            System.out.println("Age should be greater than 18 ");
           
}
}

         public static void main(String args[]){
           Scanner s=new Scanner(System.in);
           System.out.println("Enter age");
           int age=s.nextInt();
           System.out.println("Enter Weight");
           int weight=s.nextInt();
           MultipleIf obj=new MultipleIf();
           obj.clac(age,weight);

}
}