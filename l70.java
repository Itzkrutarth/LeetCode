public class l70 {

    public static int climbStairs(int n) {
     
      int a=0;
      int b=1;
      int sum=0;

      for(int i=1;i<=n;i++){
            sum = a + b;
            a = b;
            b = sum;
      }


      
        return sum;
    }

  public static void main(String[] args) {

    System.out.println(climbStairs(4));
    
  }
  
}
