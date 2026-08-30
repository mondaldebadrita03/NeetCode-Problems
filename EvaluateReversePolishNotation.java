class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for(String token: tokens){
            if(token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                int a = stack.pop();
                int b = stack.pop();

                switch(token){
                    case "+" -> stack.push(b + a);
                    case "-" -> stack.push(b - a);
                    case "*" -> stack.push(b * a);
                    case "/" -> stack.push(b / a);
                }
            }
            else{
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
}
