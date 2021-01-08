
import java.util.Scanner;
public class point {
	

	 public void isValidsymbol(String s) {

         tack uio =new tack(s.length());

  for(int i=0; i<s.length(); i++)
 {
	  if((s.charAt(i) == '(')|| (s.charAt(i) == '[') ||(s.charAt(i) == '{')) {
			char dasu = s.charAt(i);
	  uio.push(dasu);
  }
	 if((s.charAt(i) == ')')|| (s.charAt(i) == ']') ||(s.charAt(i) == '}'))
  {
	System.out.println("The elementpopped out is "  +uio.pop());
  }
	
 }
 if(uio.isEmpty()) {
 
 System.out.println("the string is balanced ");
 
 }
 else
 {
     System.out.println("the string is not balanced  ");
 }
	  

  }
	 
	 
	 
	   
public static void main(String [] args)
{
point d = new point();
Scanner sc= new Scanner(System.in);
System.out.println("enter the string ");
String s = sc.next();
 
d.isValidsymbol(s);
		
		
	}
	
	

}
