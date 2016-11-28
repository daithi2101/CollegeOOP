package lab5;
import java.util.Scanner;

/*
 * Created by David on 08/10/2016.
 */
public class Exercise1 {
    public static void main(String args[]) {
        int age, weight;
        float height;
        String gender, criminalRecord, irishGrade, takeCourse;
        char sex, record,grade, course;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your age: ");
        age = input.nextInt();

        System.out.print("Please enter your height: ");
        height =input.nextFloat();

        System.out.print("Please enter your weight: ");
        weight = input.nextInt();

        System.out.print("Please enter your gender <m or f>: ");
        input.nextLine();
        gender = input.nextLine();

        sex = gender.toLowerCase().charAt(0);

        System.out.print("Do you have a criminal record <y or n>? ");
        criminalRecord = input.nextLine();

        record = criminalRecord.toLowerCase().charAt(0);

        if((age >= 18 && age <= 35 && ((height >= 1.85 && sex == 'm') || (height >= 1.6 && sex == 'f')) )
                && weight < 100 && record == 'n') {

            System.out.print("Did you receive at least a D grade in pass Irish in the Leaving cert <y or n>? ");
            irishGrade = input.nextLine();
            grade = irishGrade.toLowerCase().charAt(0);

            if(grade == 'y'){
                System.out.print("\nCongratulations - you are eligible to join the Gardai");
            } else {
                System.out.print("\nDo you commit to taking a 10 week Irish course on application <y or n>? ");
                takeCourse = input.nextLine();
                course = takeCourse.toLowerCase().charAt(0);

                if(course == 'y') {
                    System.out.print("\nCongratulations - you are eligible to join the Gardai");
                } else {
                    System.out.print("\nCommiserations - you are not eligible to join the Gardai");
                }
            }
        } else {
            System.out.print("\nCommiserations - you are not eligible to join the Gardai");
        }

        input.close();
    }
}
