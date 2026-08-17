class Solution {
    public boolean isValid(String s) {
        Map<Character,Character>mapy=new HashMap<>();
        Stack<Character>stack=new Stack<>();

        mapy.put(')', '(');
        mapy.put(']', '[');
        mapy.put('}', '{');

        for(char c:s.toCharArray()){
            if(mapy.containsKey(c)){
                if(!stack.isEmpty() && stack.peek()==mapy.get(c)){
                    stack.pop();
                }else{
                    return false;
                }
                }else{
                 stack.push(c);
                }
            }
            return stack.isEmpty();
        }
    }
