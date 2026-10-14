import java.util.*;

public class Main {

    public static boolean validParantheses(String s){

        Stack<Character> result = new Stack<>();
        
        for(char c: s.toCharArray()){

            if(c == '(') result.push(')');
            else if(c == '[') result.push(']');
            else if (c == '{') result.push('}');

            else if(result.isEmpty() || result.pop() != c) return false;


        }

        return result.isEmpty();
    } 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        System.out.println(validParantheses(s));
    }
}
