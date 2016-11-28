package lab8;
/*
 * Created by David O Connor on 14/11/2016.
 */
public class Exercise3 {
    public static void main(String[] args) {
        float principal = 100000, interest = 0.03f;
        int year = 0;

        while(principal >= 12000){
            principal += (principal * interest);
            principal -= 12000;

            System.out.println("Balance at the end of year " + (year + 1) + " is EUR" + String.format("%.2f", principal));
            year++;
        }
    }
}
