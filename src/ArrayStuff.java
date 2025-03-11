import java.util.Random;
import java.util.Scanner;

public class ArrayStuff {

    public static void main(String[] args) {
        //task 1

        int[] dataPoints = new int[100];

        //task 2

        Random rand = new Random();
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rand.nextInt(100)+1;}
        for (int i = 0; i < dataPoints.length; i++) {
            System.out.print (dataPoints[i] + "  ");}

        //task 3

        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rand.nextInt(100)+1;}
        for (int i = 0; i < dataPoints.length; i++) {
            System.out.print (dataPoints[i] + " | ");}

        //task 4

        int sum = 0;
        for (int i = 0; i < dataPoints.length; i++) {
            sum = sum + dataPoints[i];
            System.out.print ("The sum of the data points is:" + sum);
        }
        int ave = sum / dataPoints.length;
        System.out.println("\nThe average of the data points is:" + ave);

        //task 5

        Scanner input = new Scanner(System.in);
        int intValue =SafeInput.getRangedInt(input, "Please enter a value between 1 and 100.", 1, 100);

        //task 6



        //task 7



        //task 8



        //task 9



    }
}