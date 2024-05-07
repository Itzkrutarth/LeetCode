import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class l205 {
  
    public static boolean isIsomorphic(String s, String t) {
      Map<Character,Integer> map1=new HashMap<>();
      Map<Character,Integer> map2=new HashMap<>();
      for(int i=0;i<s.length();i++){
        if(map1.containsKey(s.charAt(i))){
          int counter=map1.get(s.charAt(i));
          map1.put(s.charAt(i), counter+1);
        }else{
          map1.put(s.charAt(i), 1);
        }  
        if(map2.containsKey(t.charAt(i))){
          int counter=map2.get(t.charAt(i));
          map2.put(t.charAt(i), counter+1);
        }else{
          map2.put(t.charAt(i), 1);
        }  
      }
      System.out.println(map1);
      System.out.println(map2); 

      for(int i=0;i<s.length();i++){
        if(map1.containsValue(i)){
          
        }
      }
      
     
      
      
     return false;
    }
    public static void main(String[] args) {

      String first="paper";
      String second="title";
      
      System.out.println(isIsomorphic(first, second));
    }


  
}
