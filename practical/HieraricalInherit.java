package practical;



class Addition
{
  public void add()
  {
  int x,y=30,z=10;
  x=y+z;
  System.out.println("Add="+x);
  }  
}
//extending Addition
class Subtraction extends Addition
{
 void sub()
  {
  int x,y=30,z=10;
  x=y-z;
  System.out.println("Sub="+x);
  }  
}
//extending same class Addition
class Multiplication extends Addition
{
 void multi()
  {
  int x,y=30,z=10;
  x=y*z;
  System.out.println("Multiply="+x);
  }  
}
class HieraricalInherit
{
 public static void main(String[] args)
 {
  //Creating instance(object)
  Multiplication obj=new Multiplication();
  //calling base class function
  obj.add();
  //calling derive class function
  obj.multi();
 }
}
