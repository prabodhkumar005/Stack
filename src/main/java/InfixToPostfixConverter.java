import java.util.Stack;

public class InfixToPostfixConverter {
    public static void main(String[] args) {
        String infix="9-(5+3)*4/6";
        System.out.println(infix);
        Stack<String> stack=new Stack<>();
        Stack<Character> operator=new Stack<>();
        for(int i=0;i<infix.length();i++){
            char ch=infix.charAt(i);
            int ascii=(int)ch;
            //'0'->48 and '9'->57
            if(ascii>=48 && ascii<=57){//check value 0to 9
                String s=""+ch;
                stack.push(s);
            }
            else if(operator.isEmpty()||ch=='('||operator.peek()=='('){
                operator.push(ch);
            }
            else if(ch==')'){
                while(operator.peek()!='('){ //jabtak opening bracket nhi aa jata
                    // work
                    String v2=stack.pop();
                    String v1=stack.pop();
                    char operatorVal=operator.pop();
                    String t=v1+v2+operatorVal;
                    stack.push(t);
                }
                operator.pop();// '(' hata diya
            }
            else{
                if(ch=='+'||ch=='-'){
                    // work
                    String v2=stack.pop();
                    String v1=stack.pop();
                    char operatorVal=operator.pop();
                    String t=v1+v2+operatorVal;
                    stack.push(t);
                    // push
                    operator.push(ch);
                }
                if(ch=='*'||ch=='/'){
                    if(operator.peek()=='*'||operator.peek()=='/'){
                        // work
                        String v2=stack.pop();
                        String v1=stack.pop();
                        char operatorVal=operator.pop();
                        String t=v1+v2+operatorVal;
                        stack.push(t);
                        // push
                        operator.push(ch);
                    }
                    else operator.push(ch);
                }
            }
        }
        // stack stack size->1
        while(stack.size()>1){
            String v2=stack.pop();
            String v1=stack.pop();
            char operatorVal=operator.pop();
            String t=v1+v2+operatorVal;
            stack.push(t);
        }
        String prefix=stack.pop();
        System.out.println(prefix);
    }
}
