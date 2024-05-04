public class l66 {
  public static int[] plusOne(int[] digits) {

    int ans = 1;
    int mul=1;
    

    

    for(int i=digits.length-1;i>=0;i--){
      int midnanswer=digits[i]*mul;
      ans+=midnanswer;
      mul*=10;
    }

    String final_answer=String.valueOf(ans);


    char[] chars=final_answer.toCharArray();
    int arr[] = new int[chars.length];

    System.out.println(arr.length);

    

    for(int i=0;i<chars.length;i++){
      arr[i]=Character.getNumericValue(chars[i]);
      
    }
    
    return arr;
        
  }
  public static void main(String[] args) {
    int[] given={9,9,9};
    System.out.println(plusOne(given));
  }
}
