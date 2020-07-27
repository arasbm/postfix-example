import java.util.Stack;
import java.util.Scanner;

public class PostFixEvaluator
{
  private final static char ADD = '+';
  private final static char SUBTRACT = '-';
  private final static char MULTIPLY = '*';
  private final static char DIVIDE = '/';
  private Stack<Integer> stack;
  
  public PostfixEvaluator()
  {
    stack = new Stack<Integer>();
  }
  
  public int evaluate(String expr)
  {
    //todo need to finish implementation
    /*int op1, op2, result = 0;
    String token;
    Scanner parser = new Scanner(expr);
    while (parser.hasNext())
    {
      token = parser.next();
      if (isOperator(token))
      {
        op2 = (stack.pop()).intValue();
        op1 = (stack.pop()).intValue();
        result = evaluateSingleOperator(token.charAt(0), op1, op2);
        stack.push(new Integer(result));
      }
      else
        stack.push(new Integer(Integer.parseInt(token)));
    }
    return result;*/
    return 0;
  } 
}