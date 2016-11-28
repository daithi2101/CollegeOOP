package christmas2015;
/*
 * Created by David O Connor on 11/10/2016.
 */
public class Question1_2015 {
     public static void main(String args[]) {
         String languageName = "Java";
         String owner = "Oracle";
         int firstReleased = 1995;
         float currentVersion = 8.60f;

         System.out.print("\t\t*****************************\n");
         System.out.print("\t\t\tSome data about Java\n");
         System.out.print("\t\t*****************************\n\n");

         String formatString = String.format("%-20s%s\n%-20s%s\n%-20s%d\n%-20s%.2f",
                 "Language Name:", languageName, "Owner:", owner, "First Released:", firstReleased
         , "Current Version:", currentVersion);
         System.out.print(formatString);

         System.out.print("\n\nDebugging is twice as hard as writing the code in the first place.\n" +
                 "Therefore, if you write the code as cleverly as possible, you are,\n" +
                 "by definition, not smart enough to debug it.");
         System.out.print("\n\n\t\t- Brian W. Kernighan (Canadian computer scientist and" +
                 "\n\t\t\t\t\tco-author of C programming language)");


     }
}
