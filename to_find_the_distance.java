import java.util.Scanner;
class Main 
{
    public static void main(String[] args)
    {
        float u,t,a,s=0;
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter the interval");
        int interval=obj.nextInt();
        for(int i=1;i<=interval;i++)
        {
            System.out.println("Interval"+i);
            System.out.print("Enter the time");
            t= obj.nextFloat();
            System.out.print("Enter the initial velocity");
            u=obj.nextFloat();
            System.out.print("Enter the acceleration");
            a=obj.nextFloat();
            s=s+u*t+(0.5f*a*t*t);
        }
        System.out.println("Distance travelled is"+s);
    }
}
