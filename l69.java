class l69 {
    public static int mySqrt(int x) {

      int left=0;
      int right=x;

      while(left<=right){
        int mid=(left+right)/2;

        if(mid*mid<x){  //then search right
            left=mid+1;
        }
        else if(mid*mid>x){//search left
          right=mid-1;
        }
        else{//found
          return mid;
        }

        
      }

      
        return right;
    }

    public static void main(String[] args) {
      int x=69;
      System.out.println(mySqrt(x));
    }
}