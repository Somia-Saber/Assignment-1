
package assignment.pkg3;

import java.util.Scanner;

public class problem_3 {

    public static void main(String[] args) {
        int count =0;
     System.out.println("pleas enter word");
     Scanner in =new Scanner(System.in);
     String word=in.nextLine();
      System.out.println("pleas enter charactar");
      String letter=in.nextLine();
      char let=letter.charAt(0);
      for(int i=0;i<word.length();i++){
      char w1=word.charAt(i);
      if(w1==let)
          count++;
      }
      System.out.println(count);
    }
}
