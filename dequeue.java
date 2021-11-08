import java.util.*;
//https://www.hackerrank.com/challenges/java-dequeue/problem
public class test
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      HashSet<Integer> set = new HashSet<>();
      Deque<Integer> deque = new ArrayDeque<>();
      int n = in.nextInt();
      int m = in.nextInt();
      int unique = 0;

      for (int i = 0; i < n; i++)
      {
         int num = in.nextInt();

         deque.add(num);
         set.add(num);

         if(deque.size() == m)
         {
            if(set.size() > unique)
               unique = set.size();

            int f = deque.remove();
            if(!deque.contains(f))
               set.remove(f);
         }
      }
      System.out.println(unique);
   }
}