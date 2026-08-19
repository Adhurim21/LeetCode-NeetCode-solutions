class Solution {
    public int evalRPN(String[] tokens) {

        Stack<Integer>stack=new Stack<>();

        for(String token:tokens){
            if(isOperator(token)){
                int b=stack.pop();
                int a=stack.pop();

                int result=switch(token){
                    case"+"->a+b;
                    case"-"->a-b;
                    case"*"->a*b;
                    case"/"->a/b;
         default -> throw new IllegalArgumentException("not good token"+token);
            };
                stack.push(result);
            }else{
                stack.push(Integer.parseInt(token));
            }
          }
           return stack.pop();
        }

        private boolean isOperator(String token){
            return token.equals("+")||token.equals("-")
            || token.equals("*")||token.equals("/");

      }
    }      