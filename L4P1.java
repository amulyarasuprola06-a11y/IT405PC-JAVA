import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.FileNotFoundException;
   
  class L4P1{
       public static void main(String...args){
        Scanner s=new Scanner(System.in);
       try{
          int x= s.nextInt();
          int y =s.nextInt();  
         System.out.println(x/y);
      }
       catch(InputMismatchException ime){
        System.out.println(ime.getMessage());
      {
        catch(ArithmeticException ame){
         System.out.println(ame.getMessage());
     }
       finally{
        System.out.println("Exception handled");
  } 
    }
      