class ComparsionDemo{
 public void cal(){
    int a=15 , b=7;
    System.out.println("a>b"+(a>b));
    System.out.println("a<b"+(a<b));
    System.out.println("a>=b"+(a>=b));
    System.out.println("a<=b"+(a<=b));
    System.out.println("a==b"+(a==b));
    System.out.println("a!=b"+(a!=b));
    System.out.println((a>b)&&(a++<b));
    System.out.println((a>b)&(a++<b));
    System.out.println((a>b)||(a<b));
    System.out.println((a>b)|(a<b));
}

 public static void main(String args[]){
   ComparsionDemo obj=new ComparsionDemo();
   obj.cal();

}
}