public class l190 {

    // you need treat n as an unsigned value
    public static int reverseBits(String n) {

      StringBuilder sb=new StringBuilder();

      for(int i=n.length()-1;i>=0;i--){
        sb.append(n.charAt(i));
      }

      System.out.println("reversed is "+sb.toString());

      int dec_value=0;
      int power=31;

      for(int i=0;i<sb.length();i++){
        dec_value+=Character.getNumericValue(sb.charAt(i))*(Math.pow(2, power));    
        power--;
      }
      

        
        return dec_value;
    }
    public static void main(String[] args) {
       String given="00000010100101000001111010011100";
      System.out.println(reverseBits(given));
    }

}
