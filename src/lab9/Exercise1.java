package lab9;

/*
 * Created by David O Connor on 21/11/2016.
 */
public class Exercise1 {
    public static void main(String[] args) {
        int total = 0;
        for(int i = 0; i <= 20; i++) {
            total += i;
        }
        System.out.println("The sum of the first 20 positive integers is " + total);
    }
}
