import java.util.Scanner;
public class demo1{
    public static void main(String args[]){
        int x[]=new int[10];
        int y[]=new int[10];
        int n;
        int m=0,c=0,line=0;
        System.out.print("enter the value of terms:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.println("enter the value of xi and yi:");
        for(int i=1;i<=n;i++)
        {
            x[i]=sc.nextInt();
            y[i]=sc.nextInt();
        }
        for(int i=1;i<=n;i++)
        {
            m=(n*(x[i]*y[i])-x[i]*y[i])/(n*(x[i]^2)-y[i]*y[i]) ;
            c=(1/n)*(y[i]-m*x[i]);
            System.out.println("y="+m+"x+"+c);
        }
    }
}