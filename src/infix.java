import java.util.Scanner;

public class infix {
String result ="";
int h;
Mapdas yes = new Mapdas(true);
    char poo;
    void isValidsymbol(String s) {
        tack opin = new tack(s.length());
        for (int i =0 ; i<s.length(); i++){
            h= i;
            char ment = s.charAt(i);

            if (yes.containsKey(ment)) {

                if (opin.isEmpty()) {
                   opin.push(ment);

                }
else if(ment == ')'){
    poo = opin.pop();
    printString(poo);
}
          else  if ((yes.priorityno(opin.arr[opin.top]) == (yes.priorityno(ment)))) {
                 poo = opin.pop();
                 printString(poo);

                 opin.push(ment);

             }
 else if((yes.priorityno(opin.arr[opin.top])> (yes.priorityno(ment)))){
           poo = opin.pop();
          printString(poo);

         opin.push(ment);
      }
  else if((yes.priorityno(opin.arr[opin.top])< (yes.priorityno(ment)))){

  opin.push(ment);

}





            }

            else {
                printString(ment);
            }

        }

        if(h== s.length()-1){
            int stsize = opin.size();
        for(int j=-1; j< stsize; j++  ){
            poo = opin.pop();
            printString(poo);

            }
        }

}


void printString(char a){
    if( a !='(')
    {
        result = result + a;
        System.out.print(result);
    }




}





    public static void main(String [] args)
    {
        infix e = new  infix();
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the string ");
        String s = sc.next();

        e.isValidsymbol(s);


    }


}
