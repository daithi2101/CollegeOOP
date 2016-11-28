package lab4;
import java.util.Scanner;

/*
 * Created by David o Connor on 03/10/2016.
 */
public class Exercise3 {
    public static void main(String args[]) {
        String actualService;
        char service;
        int totalNumberOfMinutesUsa, totalNumberOfMinutesAus, totalNumberOfMinutesRussia, totalNumberOfCalls;
        final float USAVARTEC = 0.06f, AUSVARTEC = 0.08f, RUSSIAVARTEC = 0.24f, USAEIRCOM = 0.19f, AUSEIRCOM = 0.85f,
        RUSSIAEIRCOM = 0.92f;
        float totalCost;


        Scanner input = new Scanner(System.in);

        System.out.print("Which service did you use for the calls? <V - Vatrtec, E - Eircom>: ");
        actualService = input.nextLine();

        service = actualService.toUpperCase().charAt(0);

        if(service != 'V'){
            if(service != 'E') {
                System.out.print("Sorry - incorrect choice, it must be <V>artec or <E>ircom...Goodbye");
            }
        }
        if(service == 'V'){
            System.out.print("Please enter the total number of calls made in the month: ");
            totalNumberOfCalls = input.nextInt();
            if(totalNumberOfCalls == 0){
                System.out.print("thank you for your time ..... goodbye");
            }
            System.out.print("Please enter number of minutes calling the USA: ");
            totalNumberOfMinutesUsa = input.nextInt();
            System.out.print("Please enter number of minutes calling the Australia: ");
            totalNumberOfMinutesAus = input.nextInt();
            System.out.print("Please enter number of minutes calling the Russia: ");
            totalNumberOfMinutesRussia = input.nextInt();
            totalCost = ((totalNumberOfMinutesUsa * USAVARTEC) + (totalNumberOfMinutesRussia * RUSSIAVARTEC) +
                    (totalNumberOfMinutesAus * AUSVARTEC));
            String formatString1 = String.format("%s%.2f", "The total cost of using Vartec service for the month is EUR"
                    , totalCost);
            System.out.print(formatString1);
            final float AVERAGECOSTVAR = (((totalNumberOfMinutesAus * AUSVARTEC) + (totalNumberOfMinutesUsa * USAVARTEC)
                    + (totalNumberOfMinutesRussia * RUSSIAVARTEC)) / totalNumberOfCalls);
            String formatString2 = String.format("%s%.2f", "\n\nThe average cost per call made is EUR", AVERAGECOSTVAR);
            System.out.print(formatString2);
        }
        if(service == 'E') {
            System.out.print("Please enter the total number of calls made in the month");
            totalNumberOfCalls = input.nextInt();
            if (totalNumberOfCalls == 0) {
                System.out.print("thank you for your time ..... goodbye");
            }
            System.out.print("Please enter number of minutes calling the USA: ");
            totalNumberOfMinutesUsa = input.nextInt();
            System.out.print("Please enter number of minutes calling the Australia: ");
            totalNumberOfMinutesAus = input.nextInt();
            System.out.print("Please enter number of minutes calling the Russia: ");
            totalNumberOfMinutesRussia = input.nextInt();
            totalCost = (totalNumberOfMinutesAus * AUSEIRCOM) + (totalNumberOfMinutesUsa * USAEIRCOM) +
                    (totalNumberOfMinutesRussia * RUSSIAEIRCOM);
            String formatString3 = String.format("%s%.2f", "The total cost of using Eircom service for the month is EUR"
                    , totalCost);
            System.out.print(formatString3);
            final float AVERAGECOSTEIR = (((totalNumberOfMinutesAus * AUSEIRCOM) + (totalNumberOfMinutesUsa * USAEIRCOM)
                    + (totalNumberOfMinutesRussia * RUSSIAEIRCOM)) / totalNumberOfCalls);
            String formatString4 = String.format("%s%.2f", "\n\nThe average cost per call made is EUR", AVERAGECOSTEIR);
            System.out.print(formatString4);
        }
        input.close();
    }
}
