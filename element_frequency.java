// Write a function that finds the frequency of each element in a given array.
import java.util.Arrays;
public static void frequency(int arr[])
{
   HashMap<Integer, Integer> map = new HashMap<>();
   for(int i = 0; i < arr.length; ++i)
   {
      if(map.containsKey(arr[i])
         map.put(arr[i], map.get(arr[i]) + 1);
      else
         map.put(arr[i], 1);
   }
   
   for(Map.Entry e : map.entrySet())
      System.out.println(e.getKey() + " " + e.getValue());
}