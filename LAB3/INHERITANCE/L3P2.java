class L3P2 extends L3P1{
    static int neu=5;
      public static void display(){
       System.out.println(view+neu);
     }
      @override
      public int show(){
      super.show();
       return (view+neu);
     }
     public void pearl(){
     super.display();
     System.out.println("B is child of A");
    }
     }
