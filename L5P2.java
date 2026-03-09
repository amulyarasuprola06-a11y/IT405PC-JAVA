import java.lang.reflect.Method;
import java.lang.annotation.*;

class L5P2{
    @Bullet(str = "Amulya",dbl=12.454645)
    public static void anyMethod() throws NoSuchMethodException{
 
   //get method object
Method mtd = L5P2.class.getMethod("anyMethod");

   //get annotation access
  
    Bullet b= mtd.getAnnotation(Bullet.class);

     System.out.println("String..."+b.str());
     System.out.println("Double..."+b.dbl());
 }
    public static void main(String...args)throws NoSuchMethodException{
      anyMethod();
   }
}
      

        