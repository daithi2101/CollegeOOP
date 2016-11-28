package lab9;

/*
 * Created by David O Connor on 21/11/2016.
 */
public class Exercise5 {
    public static void main(String[] args) {
        int first = 0, second = 1, fibonacci;

        System.out.println("The Fibonacci numbers < 5000 are: \n");

        System.out.print(second);

        for (int i = 0; i < 100; i++) {
            fibonacci = first + second;
            first = second;
            second = fibonacci;

            if(fibonacci < 5000)
                System.out.print("," + fibonacci);
            else
                break;
        }
    }
}
