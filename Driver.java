import java.util.*; //Up to user input 

public class Driver
{ 
  public static void main(String[] args) 
  { 
    Scanner input = new Scanner(System.in); 
    String expression; 
    String again; 
    
    do 
    {  
      //PostfixEvaluator evaluator = new PostfixEvaluator();
      System.out.println("Enter a valid post-fix expression one token " +
                         "at a time with a space between each token (e.g. 5 4 + 3 2 1 - + *)");
      System.out.println("Each token must be an integer or an operator (+,-,*,/)");
      expression = input.nextLine();
      //result = evaluator.evaluate(expression);
      System.out.println();
      //System.out.println("That expression equals " + result);
      System.out.print("Evaluate another expression [Y/N]? ");
      again = input.nextLine();
      System.out.println(); 
    }
    
    while(again.equalsIgnoreCase("y")); 
  } 
}
