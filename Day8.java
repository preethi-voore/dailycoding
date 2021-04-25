//balanced paranthesis
import java.io.*;
import java.util.*;
  
class Day8
{   
    
    public static void main (String[] args)
    {
    	Stack<Character> charStack = new Stack<>();
       Scanner sc=new Scanner(System.in);
       String s=sc.nextLine();
       int f=0;
      // System.out.println(s);
       for(int i=0;i<s.length();i++) {
    	   char a=s.charAt(i);
    	   if ((a=='(')||(a=='{')||(a=='['))
    		   charStack.push(a);
    		   else {
    			   char x=charStack.pop();
    			   System.out.println(charStack);
    			   if (((a=='(')&&(x==')'))||((a=='[')&&(x==']'))||((a=='{')&&(x=='}'))) {
    				   continue;
    				   
    			   }
    			   else {
    				   f=1;
    				   break;
    			   }
    			   
    			   
    			   
    		   }
    		   
       }
       if(f==0 && charStack.isEmpty()) {
    	   System.out.println("balanced");
    	   
       }
       else {
    	   System.out.println("unbalanced");
       }
       
       
       
       
       
    
       
       
       
}
}