import java.util.Scanner;
import java.util.InputMismatchException;
class L4P4{
      public static void getvalue(int x){
     if(x % 2 != 0)
        throw new InputMismatchException("odd values");
     else 
        System.out.println(x);
   } 
    public static void main(String...args)throws Exception{
      Scanner s = new Scanner(System.in);
  try{
 int a =s. nextInt();
     getvalue(a);
  }catch(Exception e){
System.out.println(e.getMessage());
   }
}
}
