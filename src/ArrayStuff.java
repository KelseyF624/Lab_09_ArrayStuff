import java.util.Random;
import java.util.Scanner;

public class ArrayStuff {

    public static void main(String[] args) {


        //task 1

        int[] dataPoints = new int[100];

        //task 2

        Random rand = new Random();
        //for (int i = 0; i < dataPoints.length; i++) {
        // dataPoints[i] = rand.nextInt(100)+1;}
        // for (int i = 0; i < dataPoints.length; i++) {
        // System.out.print (dataPoints[i] + "  ");}

        //task 3

        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rand.nextInt(100) + 1;
        }
        for (int dataPoint : dataPoints) {
            System.out.print(dataPoint + " | ");
        }

        //task 4

        int sum = 0;
        for (int dataPoint : dataPoints) {
            sum += dataPoint;
        }
        int average = sum / dataPoints.length;
        System.out.println("\nThe sum of the data points is: " + sum);
        System.out.println("The average of the data points is: " + average);

        //task 5

        Scanner input = new Scanner(System.in);
        int intValue = SafeInput.getRangedInt(input, "Please enter a value between 1 and 100.", 1, 100);

        //task 6

        int searchTarget = intValue;
        boolean found = false;
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == searchTarget) {
                found = true;
                System.out.println("Found " + searchTarget + " at index " + i);
            }
            if (!found) {
                System.out.println("Not found " + searchTarget + " at index " + i);
            }
        }


        //task 7

        int searchTarget2 = SafeInput.getRangedInt(input, "Please enter a value between 1 and 100.", 1, 100);
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == searchTarget2) {
                found = true;
                System.out.println("Found " + searchTarget2 + " at index " + i);
                break;
            }
            if (!found) {
                System.out.println("Not found " + searchTarget2 + " at index " + i);
            }
        }

        //task 8

        int min = dataPoints[0];
        int max = dataPoints[0];

        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] < min) {
                min = dataPoints[i];
            }
            if (dataPoints[i] > max) {
                max = dataPoints[i];
            }
        }
        System.out.println("The minimum value is: " + min);
        System.out.println("The maximum value is: " + max);

        System.out.println("Average of dataPoints is: " + getAverage(dataPoints));
    }

        //task 9
        public static double getAverage(int values[]){
        int sum = 0;
        int[] dataPoints = new int[100];
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
            return (double) sum/values.length;
        }

    }
