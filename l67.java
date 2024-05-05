public class l67 {

    public static String addBinary(String a, String b) {

      StringBuilder result=new StringBuilder();

      int base=2;  //binary
      int ans=0;
      int carry=0;

      int alen=a.length()-1;//100
      int blen=b.length()-1;//101

      // Start from the end of each binary string
      int i=alen;
      int j=blen;

    
        
      while (i>=0 || j>=0 || carry==1) {   //start iterating from right to left


        int bit1=(i>=0)?a.charAt(i--)-'0':0;  //:0 bcz if two numbers are not equal in length thn append 0
        int bit2=(j>=0)?b.charAt(j--)-'0':0;

        ans=bit1+bit2+carry;

        result.insert(0, ans%base);
        carry=ans/base;

      }

      return result.toString();
        
    }


  public static void main(String[] args) {

    String a="1010";
    String b="1011";


    System.out.println(addBinary(a, b));

    
    
  }
  
}
