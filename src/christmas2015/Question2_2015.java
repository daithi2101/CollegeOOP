package christmas2015;
import java.util.Scanner;

/*
 * Created by David on 12/10/2016.
 */
public class Question2_2015 {
    public static void main(String args[]) {
        String prsiClassString;
        float grossIncome;
        float prsi;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the PRSI class of the citizen: ");
        prsiClassString = input.nextLine();
        char prsiClass = prsiClassString.toUpperCase().charAt(0);

        System.out.print("Please enter the gross income of the citizen: ");
        grossIncome = input.nextFloat();

        if(prsiClass == 'A' && grossIncome > 18304) {
            prsi = (grossIncome * .04f);
        } else if((prsiClass == 'B' || prsiClass == 'C' || prsiClass == 'D') && grossIncome <= 75036) {
            prsi = (.009f * grossIncome);
        } else if((prsiClass == 'B' || prsiClass == 'C' || prsiClass == 'D') && grossIncome > 75036) {
            prsi = ((.009f * 75036) + ((grossIncome - 75036) * .04f));
        } else if(prsiClass =='S' && grossIncome <= 500) {
            prsi = (.04f * 500);
        } else if(prsiClass == 'S' && grossIncome > 500) {
            prsi = (.04f * grossIncome);
        } else {
            prsi = 0;
        }

        System.out.print("\nThe PRSI due by the citizen is EUR" + String.format("%.2f", prsi));

        input.close();
    }
}
