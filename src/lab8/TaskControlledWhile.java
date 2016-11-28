package lab8;
/*
 * Created by David O Connor on 14/11/2016.
 */
public class TaskControlledWhile {
    public static void main(String[] args) {
        int value = 0;

        while(Math.pow(value, 5) <= 100000)
            value++;

        System.out.println("\nThe smallest positive integer whose fifth power exceeds 100000 is " + value);
    }
}
