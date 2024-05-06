public class l168 {
  
    public static String convertToTitle(int columnNumber) {
      StringBuilder sb=new StringBuilder();

      
      while (columnNumber>0) {
        int r=(columnNumber-1)%26;
        sb.append((char)(r+'A'));
        columnNumber=(columnNumber-1)/26;
      }

      System.out.println(sb.reverse().toString());

      return sb.reverse().toString();
      
        
    }
    public static void main(String[] args) {
      int index=701;
      convertToTitle(index);
    }

}
