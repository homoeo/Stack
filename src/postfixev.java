import java.util.Scanner;

public class postfixev {

   void Evalaute(String a){
   tack stack = new tack(a.length());
   for(int i = 0; i<a.length(); i++){

   char jd = a.charAt(i);
   if(Character.isDigit(jd)){
   stack.push(jd);

  }

 else {
 String result =  String.valueOf(result(Character.getNumericValue(stack.pop()),
          Character.getNumericValue(stack.pop())
          ,jd));

 stack.push(result.charAt(0));


 }

 }

   System.out.println("the result "+stack.pop()+"is");

    }

    int result(int num1, int num2, char oper){
        int sid = switch (oper) {
            case '+' ->  (num2 + num1);
            case '-' ->  (num2 - num1);
            case '*' ->  (num2 * num1);
            case '/' ->  (num2 / num1);
            default -> '0';
        };

      return  sid;

    }








public static void main(String [] args ) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    postfixev jin = new postfixev();
    jin.Evalaute(s);

}


}
