package christmas2013;

/*
 * Created by Dave on 15-Dec-16.
 */
public class Question_3b_2013 {
    public static void main(String[] args) {
        int i = 0, term = 0;

        while(term < 500) {
            term += ((i + 1) * (i + 1));
            i++;
        }
        System.out.println("The term ... is term " + i);
    }
}
