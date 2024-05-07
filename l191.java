class l191{
 
    public static int hammingWeight(int n) {
     

      String bin_value=Integer.toBinaryString(n);

      int counter=0;

      for(int i=0;i<bin_value.length();i++){
        if(bin_value.charAt(i)=='1'){
          counter++;
        }
      }

        return counter;
        // int temp=n;
        // int weight=0;
        // while(temp>0)
        // {
        //     if(temp%2==1)
        //         weight++;
        //     temp=temp/2;
        // }

        // return weight;
    }
    public static void main(String[] args) {
      int decimal=2147483645;
      System.out.println(hammingWeight(decimal));
    }

}