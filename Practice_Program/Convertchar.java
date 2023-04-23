package Practice_Program;

import java.util.*;
class Solution {
	
	public static void main(String args[]) {
		
		// Write code here
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0); 
     
        if(ch <= 'A' && ch >= 'Z')
        {
            System.out.println(+ch+ "is an upper case alphabet hence the output is 1.");
        }
        else if(ch <= 'a' && ch >= 'z')
        {
           System.out.println(ch+ "is a lower case alphabet hence the output is 0.");
        }
        else
        {
            System.out.println(ch+" is a symbol and neither an upper case alphabet nor lower case alphabet: hence the output is -1.");
        }
		
	}
}
