import java.lang.Math;
import java.util.Scanner;
class compute
    {
        void COMP(double a,double b, double c,double Discriminant) throws myexception
        {
        if(Discriminant<0)
        {
            throw new myexception(Discriminant);
        }
        else if(Discriminant==0)
        {
            System.out.println("Roots are equal.");
            System.out.println("Root is: "+(-b/2*a));
        }
        else
        {
            System.out.println("Roots are unequal and real");
            System.out.println("Root 1 is: "+((-b + Math.pow(Discriminant, 0.5)) / (2.0 * a)));
            System.out.println("Root 2 is: "+((-b - Math.pow(Discriminant, 0.5)) / (2.0 * a)));
        }
        }
    }

    class myexception extends Exception
    {
        myexception(double d)
        {
            System.out.println("Discriminant cannot be negative");
        }
    }
    public class Exception_in_QuadraticEquations{
    static Scanner sc=new Scanner(System.in);
    
    public static void main(String[] args) 
    {
        compute B= new compute();
        double a=0,b=0,c=0;
        double Discriminant=0;
        
        System.out.println("Enter the value of constant A: ");
        a=sc.nextDouble();
        System.out.println("Enter the value of constant B: ");
        b=sc.nextDouble();
        System.out.println("Enter the value of constant C: ");
        c=sc.nextDouble();

        System.out.println("The equation is: "+a+"x^2+"+b+"x+"+c);

        Discriminant=b*b-4*a*c;
        try{
        B.COMP(a,b,c,Discriminant);
        }
        catch(Exception e){
            System.out.println("ERORR!!!!!!!!!!!!!!\n"+e);
        }
    }
}
