package lab8;
/*
 * Created by David O Connor on 14/11/2016.
 */
public class Exercise1 {
    public static void main(String[] args) {
        int value = 0;

        while(Math.pow(value,3) >= -15000)
            value--;

        System.out.println("The largest negative integer whose cube is less than -15,000 is " + value);
    }
}
