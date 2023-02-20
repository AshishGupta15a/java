import java.util.Scanner;
public class Compare_Floating_Points {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first floating point number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second floating point number: ");
        double num2 = sc.nextDouble();
        num1=Math.round(num1*1000);
        num1=num1/1000;
        num2=Math.round(num2*1000);
        num2=num2/1000;
        if (num1 == num2) 
        {
            System.out.println("The numbers are equal");
        } 
        else 
        {
            System.out.println("The numbers are not equal");
        }
    }
}