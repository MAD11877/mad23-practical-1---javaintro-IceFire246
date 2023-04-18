import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    int size = in.newInt();
    int[] numArray = new int[size];
    int loop = 0;
    
    while (size-- > 0)
    {
      loop++;
      int num = in.nextInt();
      numArray[loop] = num;
    }
    
    int maxCount = 0;
    int result;
    for (int i = 0; i < loop; i++)
    {
      int num1 = numArray[i];
      int count = 0;
      for (int j = 0; i < loop; j++)
      {
        int num2 = numArray[j];
        if (num1 == num2) { count++; }
      }
      if (count > maxCount)
      {
        maxCount = count;
        result = num1;
      }
    }
    System.out.println(result);
  }
}
