

public class l121 {
  
    public static int maxProfit(int[] prices) { 
      int final_profit=0;

    for(int i=0;i<prices.length-1;i++){

      // 7,1,5,3,6,4

      int buy_price=prices[i];
      int sell_price=prices[i+1];
      int profit=sell_price-buy_price;
      
      System.out.println("initial buy is "+buy_price);
      System.out.println("initial sell price will be "+sell_price);
      System.out.println("initial profit will be "+profit);
      for(int j=i+1;j<prices.length;j++){
        System.out.println("sells are "+prices[j]);
        System.out.println();
        
          if(prices[j]-prices[i]>profit && prices[j]-prices[i]>final_profit){
            profit=prices[j]-prices[i];
            final_profit=prices[j]-prices[i];;
            System.out.println("new profit will be "+profit);
          }
          
        }
        System.out.println();
        System.out.println("mid profit  will be "+profit);
        
      }
      System.out.println("final overall profit  will be "+final_profit);
      
      return final_profit;
    

    

    }
    public static void main(String[] args) {

      int[] tcs={2,1};

      System.out.println(maxProfit(tcs));
      
    }

  
}
