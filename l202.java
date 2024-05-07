public class l202 {
  
    public static boolean isHappy(int n) {

      int sqsum=0;
     
      //19
      while (n>0) {
        sqsum+=Math.pow(n%10, 2);
        n/=10;
      }

      if(sqsum==1){
        return true;
      }  
      
  
      return isHappy(sqsum);

      // public static boolean isHappy(int n) {
      //   int sqsum = 0;
        
      //   // Calculate the sum of squares of digits
      //   while (n > 0) {
      //       sqsum += Math.pow(n % 10, 2);
      //       n /= 10;
      //   }
    
      //   // If the sum is 1, return true
      //   if (sqsum == 1) {
      //       return true;
      //   }  
        
        // // Recursively check if the sum is happy
        // return isHappy(sqsum);
    }
    
    
    public static void main(String[] args) {

      int given=25;
      System.out.println(isHappy(given));
      
    }

  
}
