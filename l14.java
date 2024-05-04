import java.util.Arrays;
class l14{

  public static String longestCommonPrefix(String[] strs) {

    StringBuilder result=new StringBuilder();

    Arrays.sort(strs);

    char[] first= strs[0].toCharArray();
    char[] last= strs[strs.length-1].toCharArray();

    for(int i=0;i<first.length;i++){
     if(first[i]!=last[i]){
      break;
     }
     result.append(first[i]);
    }

    System.out.println(result);

    return result.toString();

  }
  public static void main(String[] args) {

    String[] strs={"dog","racecar","car"};

    longestCommonPrefix(strs);
    
    
  }

  }
