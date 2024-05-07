
import java.util.Collection;
import java.util.Hashtable;

public class l217 {
  
    public static boolean containsDuplicate(int[] nums) {
      Hashtable<Integer,Integer> tbl=new Hashtable<>(); 

      for(int i=0;i<nums.length;i++){
        if(tbl.containsKey(nums[i])){
          int counter=tbl.get(nums[i]);
          tbl.put(nums[i], counter+1);
        }else{
          tbl.put(nums[i], 1);
        }      
      }

      Collection<Integer> values = tbl.values();

      for(int i : values){
        if(i>1){
            return true;
        }
      }
      return false;
    }
    public static void main(String[] args) {
      int[] arr={1,2,3,4};
      System.out.println(containsDuplicate(arr));
    }

}
