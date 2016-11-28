package lab8;
/*
 * Created by David O Connor on 14/11/2016.
 */
public class Exercise2 {
    public static void main(String[] args) {
        int power = 0;

        while(Math.pow(2, power) <= 5000)
            power++;

        System.out.println("\nThe lowest power of 2 which exceeds 5000 is " + power);
    }
}
