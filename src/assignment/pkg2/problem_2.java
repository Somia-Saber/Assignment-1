
package assignment.pkg2;
import java.util.Scanner;
public class problem_2 {
    public static void main(String[] args) {
        Scanner in =new Scanner (System.in); 
        System.out.println("please enter two word");
        int count=0;
        String word1=in.nextLine();
        String word2=in.nextLine();
      if(word1.length()==word2.length()){
        for(int i=0;i<word1.length();i++){
        if(word1.charAt(i)==word2.charAt(i)){
         count++;}
    }
}
   if(count==word1.length())
        System.out.println("yes");
        else
             System.out.println("no");      
    }}