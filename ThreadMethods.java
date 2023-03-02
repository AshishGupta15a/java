import java.util.*;
import java.lang.*;
import java.lang.Thread;
public class ThreadMethods {
        
    class A extends Thread
    {
        public void run()
        {
            for(int i=1;i<5;i++)
            {
                if(i==1) Thread.yield();
                System.out.println("Thread A: "+i);
                
            }
            System.out.println("Exit from A");
        }
    }
    class B extends Thread
    {
        public void run()
        {
            for(int j=1;j<5;j++)
            {
                System.out.println("Thread B: "+j);
                if(j==3) stop();
            }
            System.out.println("Exit from B");
        }
    }
    class C extends Thread
    {
        public void run()
        {
            for(int k=1;k<5;k++)
            {
                System.out.println("Thread C: "+k);
                if(k==1)
                try
                {
                    sleep(1000);
                }
                catch(Exception e)
                {
                    System.out.println(e);
                }
            }
            System.out.println("Exit from C");
        }
    }

    
        public static void main(String[] args)
        {
            ThreadMethods a=new ThreadMethods();
            A X= a.new A();
            B Y = a.new B();
            C Z = a.new C();
            X.start();
            Y.start();
            Z.start();
        }
}
