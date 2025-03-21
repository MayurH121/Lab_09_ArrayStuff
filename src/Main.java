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

        // Task 7
        int position = -1;
        for (int i = 0; i < dataPoints.length; i++)
        {
            if (dataPoints[i] == userValue)
            {
                position = i;
                break;
            }
        }
        if (position != -1)
        {
            System.out.println("The value " + userValue + " was found at array index " + (position + 1));
        } else
        {
            System.out.println("The value " + userValue + " was not found in the array.");
        }

        // Task 8
        int min = dataPoints[0];
        int max = dataPoints[0];
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] < min)
            {
                min = dataPoints[i];
            }
            if (dataPoints[i] > max)
            {
                max = dataPoints[i];
            }
        }
        System.out.println("The minimum value in the array is: " + min);
        System.out.println("The maximum value in the array is: " + max);

        // Task 9
        System.out.println("Average of dataPoints is: " + getAverage(dataPoints));
    }
    public static double getAverage(int values[])
    {
        int sum = 0;
        for (int i = 0; i < values.length; i++)
        {
            sum += values[i];
        }
        return (double) sum / values.length;
    }
}