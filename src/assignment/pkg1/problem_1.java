
package assignment.pkg1;

import java.util.Scanner;


public class problem_1 {

    
    public static void main(String[] args) {
         System.out.println("please enter string containing text and non-negative number ");
       Scanner in=new Scanner (System.in);
       String word=in.nextLine();
       for(int i=0;i<word.length();i++){
           char num=word.charAt(i);
       if(num=='0'||num=='1'||num=='2'||num=='3'||num=='4'||num=='5'||num=='6'||num=='7'||num=='8'||num=='9')
           System.out.println(num);
       }
    }
    
}
