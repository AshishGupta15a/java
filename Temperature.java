import java.util.*;
class Temperature 
{
    void Temp(Double[][] arr) 
    {
        System.out.println("\nEnter max temperature ");
        Scanner sc = new Scanner(System.in);
        System.out.print("In City-1: ");
        for (int i = 0; i < 31; i++)
                arr[i][0] = sc.nextDouble();
        System.out.print("In City-2: ");
        for (int i = 0; i < 31; i++)
                arr[i][1] = sc.nextDouble();
        System.out.print("In City-3: ");
        for (int i = 0; i < 31; i++)
                arr[i][2] = sc.nextDouble();
        System.out.print("In City-4: ");
        for (int i = 0; i < 31; i++)
                arr[i][3] = sc.nextDouble();
        System.out.print("In City-5: ");
        for (int i = 0; i < 31; i++)
                arr[i][4] = sc.nextDouble();
        System.out.print("In City-6: ");
        for (int i = 0; i < 31; i++)
                arr[i][0] = sc.nextDouble();
        System.out.print("In City-7: ");
        for (int i = 0; i < 31; i++)
                arr[i][0] = sc.nextDouble();
        System.out.print("In City-8: ");
        for (int i = 0; i < 31; i++)
                arr[i][0] = sc.nextDouble();
        System.out.print("In City-9: ");
        for (int i = 0; i < 31; i++)
                arr[i][0] = sc.nextDouble();
        System.out.print("In City-10: ");
        for (int i = 0; i < 31; i++)
                arr[i][0] = sc.nextDouble();

        sc.close();
    }
    void highestTemp(Double[][] arr) 
    {
        Double high = arr[0][0];
        for (int i = 0; i < 6; i++)
            for (int j = 0; j < 5; j++)
                if (high < arr[i][j])
                    high = arr[i][j];
        for (int i = 0; i < 31; i++)
            for (int j = 0; j < 10; j++)
                if (Objects.equals(high, arr[i][j]))
                    System.out.println("Highest temperature was " + high + " Celsius on day-"+ (i+1) + " in the City-" + (j+1));

    }
    void lowestTemp(Double[][] arr) 
    {
        Double low = arr[0][0];
        for (int i = 0; i < 31; i++)
            for (int j = 0; j < 10; j++)
                if (low > arr[i][j])
                    low = arr[i][j];
        for (int i = 0; i < 31; i++)
            for (int j = 0; j < 10; j++)
                if (Objects.equals(low, arr[i][j]))
                    System.out.println("Lowest temperature was " + low + " Celsius on day-"+ (i+1) + " in the City-" + (j+1));
    }
    public class Temperature1
    {
        public static void main(String[] args) 
        {
            Double[][] arr = new Double[31][10];
            Temperature obj = new Temperature();
            obj.Temp(arr);
            obj.highestTemp(arr);
            obj.lowestTemp(arr);
        }
    }
}