import java.util.Stack;

public class PrefixEvaluation {
    public static void main(String[] args) {
        String str="-9/*+5346";
        Stack<Integer> stack=new Stack<>();
        for(int i=str.length()-1;i>0;i--){
            char ch=str.charAt(i);
            int ascii=(int)ch;
            if(ascii>=48 && ascii<=57){
                stack.push(ascii-48);
            }
            else{
                int v1=stack.pop();
                int v2=stack.pop();
                if(ch=='+') stack.push(v1+v2);
                if(ch=='-') stack.push(v1-v2);
                if(ch=='*') stack.push(v1*v2);
                if(ch=='/') stack.push(v1/v2);

            }
        }
        System.out.println(stack.peek());
    }
}
