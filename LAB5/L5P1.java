import java.util.Scanner;
 
  class ExceptionMain{
         public static void main(String...args){
          Scanner s =new Scanner(System.in);
     try{
         
        int age = s.nextInt();
          if(age<18)
              throw AgeException("sorry you are not allowed to vote");
          else
             System.out.println("please give your vote");
      
         }catch(AgeException ae){
            System.out.println(ae.getMessage());
        }
        
      }
}
