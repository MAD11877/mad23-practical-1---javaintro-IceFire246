import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    /**
     * Prompts user for height and weight, calculate and print out the BMI of the user
     * 
     * Hint: in.nextDouble() to read double
     */
     
    Scanner hscan = new Scanner(System.in);
    double height = hscan.nextDouble();

    Scanner wscan = new Scanner(System.in);
    double weight = wscan.nextDouble();

    double bmi = weight / (height * height);
    System.out.println(bmi);

  }
}
