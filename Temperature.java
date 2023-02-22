import java.util.Scanner;
public class Temperature {
    public static void main(String[] args) {
        double[][] temperature = new double[2][10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature data for city 1:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Day " + (i+1) + ": ");
            temperature[0][i] = sc.nextDouble();
        }
        System.out.println("Enter temperature data for city 2:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Day " + (i+1) + ": ");
            temperature[1][i] = sc.nextDouble();
        }
        double maxTemp = temperature[0][0];
        double minTemp = temperature[0][0];
        int maxCity = 1;
        int minCity = 1;
        int maxDay = 1;
        int minDay = 1;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 10; j++) {
                if (temperature[i][j] > maxTemp) {
                    maxTemp = temperature[i][j];
                    maxCity = i+1;
                    maxDay = j+1;
                }
                if (temperature[i][j] < minTemp) {
                    minTemp = temperature[i][j];
                    minCity = i+1;
                    minDay = j+1;
                }
            }
        }
        System.out.println("Highest temperature: " + maxTemp + " in City " + maxCity + ", Day " + maxDay);
        System.out.println("Lowest temperature: " + minTemp + " in City " + minCity + ", Day " + minDay);
    }
}
