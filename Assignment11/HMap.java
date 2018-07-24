import java.util.*;  
public class HMap {  
  public static void main(String args[]) {  
  HashMap<Integer,String> hash_map= new HashMap<Integer,String>();  
  hash_map.put(1, "Dog");
  hash_map.put(2, "Cat");
  hash_map.put(3, "Lion");
  hash_map.put(4, "Parrot");
  for(Map.Entry x:hash_map.entrySet()){  
   System.out.println(x.getKey()+" "+x.getValue());  
  }  
 }  
}