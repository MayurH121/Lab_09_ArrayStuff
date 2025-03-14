import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] dataPoints = new int[100];

        // Task 2
        Random rnd = new Random();
        for (int i = 0; i < dataPoints.length; i++)
        {
            dataPoints[i] = rnd.nextInt(100) + 1; // Random value between 1 and 100
        }

        // Task 3
        for (int i = 0; i < dataPoints.length; i++)
        {
            System.out.print(dataPoints[i]);
            if (i < dataPoints.length - 1)
            {
                System.out.print(" | ");
            }
        }
        System.out.println();
    }
}