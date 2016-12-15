package christmas2013;
/*
 * Created by Dave on 15-Dec-16.
 */
public class Question_1a_2013 {
    public static void main(String[] args) {
        String name = "Venus", year = "224 Earth days";
        int distance = 108208930;
        float temp = 457.5f;

        System.out.println("\t= ... =\n\t\tSome ... planet\n\t= ... =\n\n" +
        String.format("%-30s%s\n%-30s%s\n%-30s%d%s\n%-30s%.1f%s", "Name: ", name, "Year Length: ", year,
                "Average distance from sun: ", distance, " km", "Average Temperature: ", temp, " C") +
                "\n\n\"I think ... that when \nwe can ... of Venus\nwe do ... souffles\"\n\n\t\t\t\tNicholas Kurti");
    }
}
