import java.io.InputStremReader;
import java.io.IOException;
import java.util.scanner;
   
  class L4P2{
       public static void main(String...args) throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
          BufferedReader s = new BufferedReader(isr);
       try{
          int x= Integer.parseInt(s.readLine());
          int y =Integer.parseInt(s.readLine());
         System.out.println(x/y);
      }
       catch(InputMismatchException ime){
        System.out.println(ime.getMessage());
      {
        catch(ArithmeticException ame){
         System.out.println(ame.getMessage());
     }
       catch(Exception e){
        System.out.println("Exception");
  } 
    finally{
   System.out.prinln("exception handled");
} 
}
      
      
