package solutions;
import java.util.Scanner;

/*
Create a program that prompts for a quote and an author. Display the quotation and author as shown in the example output.
    Use a single output statement to produce this output, using appropriate string-escaping techniques for quotes.
    If your language supports string interpolation or string substitution, don’t use it for this exercise. Use string
    concatenation instead. e.g. use println() instead of printf()

1: Prompt user for quote.
2: Save quote input as string Inputquote
3: Prompt user for author
4: Save author as string Inputauthor
5: Print Inputauthor + " says \"" + Inputquote + "\""
 */

public class Solution03
{
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("What is the quote? ");
        String Inputquote = in.nextLine();
        System.out.print("Who said it? ");
        String Inputauthor = in.nextLine();
        System.out.println(Inputauthor + " says, \"" + Inputquote + "\"");
    }
}
