class LogicalExample{

  public void log(){
    int a=3;
    int b=6;
    int c=10;
    System.out.println(a>b&&a<c||b<c);
    System.out.println((a<c||b>c)&&a<b);

   }
    

  public static void main(String args[]){
  LogicalExample id=new LogicalExample();
  id.log();
}
}