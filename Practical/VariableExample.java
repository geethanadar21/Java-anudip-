class VariableExample{
    static int num= 55; //static variable
    
    long num1= 939895; //long variable
    
    public void display(){ //non static method
        char a = 'G';
        double d = 45.212;
        System.out.println("This is an example of local variable: "+a);
        System.out.println("This is an example of local variable: "+d);
        
    }
    public static void calc(){ //static method
        double b = 45.65;
        double c= 86.24;
        double res = b*c;
        System.out.println("Result is: "+res);
    }
    public static void main (String args[]){
        VariableExample obj = new VariableExample();
        obj.display(); //invoke non static method with obj
        calc(); //invoke static method
        System.out.println("This is an example of instance variable, called by using object: "+obj.num1); //calling instance variable with object
        System.out.println("This is an example of static variable, calling with classname: "+VariableExample.num); //calling static variable with class name
        System.out.println("This is an example of static variable, calling without class name: "+num); //calling static variable without class name
    }
}