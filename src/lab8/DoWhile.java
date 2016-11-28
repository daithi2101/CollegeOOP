package lab8;
import java.util.Scanner;
/*
 * Created by David O Connor on 14/11/2016.
 */
public class DoWhile {
    public static void main(String[] args) {
        int mark, highMark = 0, totalMark = 0, counter = 0;

        Scanner input = new Scanner(System.in);

        do{
            System.out.print("Please enter the mark of student " + (counter + 1) + " (-1 to exit): ");
            mark = input.nextInt();

            if(mark == -1)
                break;
            if(mark > highMark)
                highMark = mark;

            totalMark += mark;
            counter++;
        }while(mark != -1);

        System.out.println("\n\nHighest mark was: " + highMark + "\nAverage mark was " +
                String.format("%.0f", (float)totalMark/counter));
    }
}
