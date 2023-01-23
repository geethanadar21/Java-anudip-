class TypcastingExample{
    public static void main (String args[]){
        
    //Widening
    int x = 890;
    long y = x; //automatically converts int to long
    System.out.println(x);
    System.out.println(y);
    double z = x; //automatically converts int to double 
    System.out.println(z);
    
    //Narrowing
    double a = 894663.56;
    int b = (int)a; //converting double into int
    System.out.println(a);
    System.out.println(b);
    }
    
}