import java.util.Scanner;
public class Lab2A {
    public static void main (String[] args) {
        Scanner consoleReader = new Scanner (System.in);

        /* name */
        System.out.print("Enter a name: ");
        String name = consoleReader.nextLine();

        /* another name */
        System.out.print("Enter another name: " );
        String AnotherName = consoleReader.nextLine();

        /* a verb */
        System.out.print("Enter a verb: " );
        String verb = consoleReader.nextLine();

        /* an adverb */
        System.out.print("Enter a adverb: " );
        String Adverb = consoleReader.nextLine();

      /* name */  System.out.print("One very late night, " + name );
      /* another name */  System.out.print( " ran into her favorite lion in the jungle, " + AnotherName + "." );
      /* a verb  */  System.out.print(" They were so exited to see each other and to " + verb + " freely again.");
      /* an adverb  */  System.out.print(" Although they were different animals in the jungle. They still were the same " + Adverb + " friends.");

      consoleReader.close();
    }
}