import java.util.Scanner;

/**
 * Types out two numbers in ascennding order
 * @author Rose
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a Scanner for user input
    Scanner input = new Scanner(System.in);

    // ask user for two integers
    System.out.println("Please enter an integer:");
    int firstInt = input.nextInt();

    System.out.println("Please enter another integer:");
    int secondInt = input.nextInt();

    if (firstInt > secondInt) {
      System.out.println("Your numbers in ascending order are " + secondInt + ", " + firstInt);
    } else if (firstInt == secondInt) {
      System.out.println("Your numbers in ascending order are " + firstInt + ", " + secondInt);
    } else {
      System.out.println("Your numbers in ascending order are " + firstInt + ", " + secondInt);
    }
    
  }
}
