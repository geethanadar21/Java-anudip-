class MyConstructor{
    
    MyConstructor(){
        System.out.println("Hiiiiiiiiii");
    }
    
    int a;
    String name;
    
   
    public void display(){
        System.out.println(a+" "+name);
    }
           
    public static void main (String args[]){
        System.out.println("aaa");
        
        MyConstructor mc = new MyConstructor();  //calling of default constructor
        mc.display();   // o & null values will be provided by constructor
        
    }
}