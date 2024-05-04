public class l27 {


    public static int removeElement(int[] nums, int val) {

      int k=0;

      for(int i=0;i<nums.length;i++){
        //check whether val==nums[i]
         if(nums[i]!=val){
          nums[k]=nums[i];
          k++;

         }
      }

      return k;
        
    }

    public static void main(String[] args) {
      
      int j=3;
      int[] arr={3,2,2,3};
      System.out.println(removeElement(arr,j));

      

    }

  
}
