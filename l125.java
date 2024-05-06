public class l125 {

    public static boolean isPalindrome(String s) {

      String check=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();

      int start=0;
      int end=check.length()-1;

      while (start<end) {
        if(check.charAt(start)!=check.charAt(end)){
          return false;
        }
        start++;
        end--;
        
      }
    


      return true;  
    }
    public static void main(String[] args) {
      String str="race a car";
      System.out.println(isPalindrome(str));
    }

  
}
