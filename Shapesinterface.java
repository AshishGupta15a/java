interface shape{
    void get();
}

class cuboid implements shape{
   public void get()
   {
       System.out.println("Cuboid is a 3D shape");
   }

}

class rectangle implements shape{
   public void get()
   {
       System.out.println("Rectangle is a 2D shape");
   }
}

public class Shapesinterface
{
   public static void main(String[] args) {
       rectangle r= new rectangle();
       r.get();
       cuboid c= new cuboid();
       c.get();
    }
}
