import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
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

        // Task 4
        int sum = 0;
        for (int i = 0; i < dataPoints.length; i++)
        {
            int value = dataPoints[i]; // Access the element at index i
            sum += value;
        }
        double average = (double) sum / dataPoints.length;
        System.out.println("The sum of the random array dataPoints is: " + sum);
        System.out.println("The average of the random array dataPoints is: " + average);

        // Task 5
        int userValue = SafeInput.getRangedInt(scanner, "Enter an integer between 1 and 100", 1, 100);

        // Task 6
        int count = 0;
        for (int i = 0; i < dataPoints.length; i++)
        {
            if (dataPoints[i] == userValue)
            {
                count++;
            }
        }
        System.out.println("The value " + userValue + " was found " + count + " times.");
    }
}