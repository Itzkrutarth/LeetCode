public class l58 {

    public static int lengthOfLastWord(String s) {
      String[] splitted=s.split(" ");
      
      return splitted[splitted.length-1].length();
        
    }
public static void main(String[] args) {
  String question="luffy is still joyboy";
  System.out.println(lengthOfLastWord(question));
}
  
}

// other solution

// public int lengthOfLastWord(String s) {
//   int count = 0;
//   int index = s.length() - 1;
//   while (index >= 0) {
//       if (s.charAt(index) != ' ') {
//           count++;
//       } else if (count > 0) {
//           return count;
//       }
//       index--;
//   }
//   return count;
// }
