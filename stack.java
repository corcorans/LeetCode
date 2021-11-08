import java.util.*;
class Solution
{
    //https://www.hackerrank.com/challenges/java-stack/problem
   private final static Map<String, String> brackets = new HashMap<String, String>(){{
      put("[", "]");
      put("{", "}");
      put("(", ")");
   }};
   private final static Set<String> closingBrackets = new HashSet<>(Arrays.asList("]", "}", ")"));

   public static boolean isBalancedInput(String input)
   {
      if("".equals(input))
         return true;
         
      Deque<String> stack = new ArrayDeque<>();
      for(int i = 0; i < input.length(); ++i)
      {
         String pos = input.substring(i, i + 1);
         if(closingBrackets.contains(pos))
         {
             if(stack.isEmpty())
                 return false;
             
             String op = stack.pop();
             if(!brackets.get(op).equals(pos))
                 return false;
         }
         else
             stack.push(pos);
      }
      return stack.isEmpty();
   }
    
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext())
        {
			String input=sc.next();
            System.out.println(isBalancedInput(input));   
        }
	}
}