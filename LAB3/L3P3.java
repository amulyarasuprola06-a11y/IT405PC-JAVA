   class L3P1{
         static int view;
        public static void display(){
        System.out.println("view");
         }
        public int show(){
          int view = 10;
          return (view);
          }
       }
        class L3P2 extends L3P1{
           static int neu;
            public static void display(){
           System.out.println ("view + neu" );
         }
          public int show(){
            return (view+neu);
         }
           public void peal(){
            System.out.println("I am a child of parent");
             }
            }
             class L3P3{
              public static void main(String...args){
               L3P2 ob = new L3P2();
               ob.show();
                ob.display();
                ob.peal();
            }
             }
             
             
           

            
           
        
           
              
            
