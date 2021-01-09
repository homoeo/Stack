import java.util.HashMap;
import java.util.Map;

public class Mapdas {

    Mapdas(boolean uyt){

        addputMap();
    }
    Map map = new HashMap<String,Integer>();


    void addputMap() {

        map.put(",", 1);
        map.put("=",2);
        map.put("+=",2);
        map.put("-=",2 );
        map.put("/=",2);
        map.put("*=",2 );
        map.put( "%=",2);
        map.put( "<<=",2);
        map.put(">>=" ,2);
        map.put( "&=",2);
        map.put("^=",2 );
        map.put("?:",3 );
        map.put( "||",4) ;
        map.put("&&",5 );
        map.put( "|",6);
        map.put("^", 7);
        map.put("&", 8);
        map.put("==", 9);
        map.put("!=", 9);
        map.put(">", 10);
        map.put(">=", 10);
        map.put("<", 10);
        map.put("<=", 10);
        map.put("<<", 11);
        map.put(">>", 11);
        map.put("+", 12);
        map.put("-", 12);
        map.put("*", 13);
        map.put("/", 13);
        map.put("%", 13);
        map.put("(int)", 14);
        map.put("(float)", 14);
        map.put("(double)", 14);
        map.put("(char)", 14);
        map.put("&*", 15);
        map.put("!", 15);
        map.put("-+", 15);
        map.put("--", 15);
        map.put("++", 15);
        map.put("->", 17);
        map.put("]", 17);
        map.put("[", 17);
        map.put(")", 17);
        map.put("(", 17);
    }

  int priorityno(char element){
String ent = String.valueOf(element);
int pot = Integer.parseInt(String.valueOf(map.get(ent)));
        return pot;
  }

  boolean containsKey(char h){
String ved = String.valueOf(h);
        if(map.containsKey(ved)){
       return true;
        }

      return false;

  }


}
