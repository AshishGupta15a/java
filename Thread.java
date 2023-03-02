import java.util.*;
import java.lang.Thread;
class Thread1
{
    class A extends Thread
    {
        public void run()
        {
            for(int i=1;i<=5;i++)
            {
                System.out.println("\tFrom Thread A :i= "+i);
            }
            System.out.println("exit from A");
        }
    }
    class B extends Thread
    {
        public void run()
        {
            for(int j=1;j<=5;j++)
            {
                System.out.println("\tFrom Thread B :j= "+j);
            }
            System.out.println("exit from B");
        }
    }
    class C extends Thread
    {
        public void run()
        {
            for(int k=1;k<=5;k++)
            {
                System.out.println("\tFrom Thread C :k= "+k);
            }
            System.out.println("exit from C");
        }
    }

        public static void main(String args[])
        {
            Thread1 a=new Thread1();
            a.new A().start();
            a.new B().start();
            a.new C().start();
        }

        
}
