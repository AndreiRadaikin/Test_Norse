import java.util.Stack;

public class first {
    public static void main(String[] args) {
        String c = "asd(sadsa)ad{faa{asd}ad}"; //Correct
        String b = "asd(aa{ss[asa]asd}asd)sad"; //Correct
        String a = "asd(aa{ss[asaasd}asd)sad"; //Wrong
        System.out.println();
        Stack stack = new Stack();
        for (int i = 0; i < a.length(); i++){
            if (Opened(a.charAt(i)))    stack.push(a.charAt(i));
            if (Closed(a.charAt(i)) && !stack.peek().equals(Inverter(a.charAt(i))))  stack.pop();
        }
        if (stack.empty()) System.out.println("Correct");
        else System.out.println("Wrong");
    }

    private static boolean Opened(char ch){
        return ch == '{' || ch == '[' || ch == '(';
        }
    private static boolean Closed(char ch){
        return ch == '}' || ch == ']' || ch == ')';
        }
    private static char Inverter (char ch){
        switch (ch){
            case '[': return ']';
            case '{': return '}';
            case '(': return ')';
        }
        return 0;
    }
}









