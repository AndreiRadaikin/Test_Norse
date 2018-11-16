import java.util.Stack;

public class first {
    public static void main(String[] args) {
        String a = "asd(asdd)sadad{sdsad{sdadsd}sadsd}sadsa"; //Correct
        String b = "asd(sdsad{sadsasad[ssadd]sda}sadad)"; //Correct
        String c = "asd(sdas{sada[sadd}asd)sdasads"; //Wrong
        System.out.println(Checker(a));
        System.out.println(Checker(b));
        System.out.println(Checker(c));
    }

    private static boolean Checker (String a){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < a.length(); i++) {
            if (Opened(a.charAt(i))) stack.push(a.charAt(i));
            else if (Closed(a.charAt(i)))
                if (stack.peek().equals(Inverter(a.charAt(i)))) stack.pop();
                else if (stack.empty() ) return false;
        }
        return stack.empty();
    }

    private static boolean Opened(char ch){
        return ch == '{' || ch == '[' || ch == '(';
        }
    private static boolean Closed(char ch){
        return ch == '}' || ch == ']' || ch == ')';
        }
    private static char Inverter (char ch){
        switch (ch){
            case ']': return '[';
            case '}': return '{';
            case ')': return '(';
            case '[': return ']';
            case '{': return '}';
            case '(': return ')';
        }
        return 0;
    }
}









