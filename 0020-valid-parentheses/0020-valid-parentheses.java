class Solution {
    public boolean isValid(String s) {
        Stack<Character> openBracket = new Stack<>();

        for (char bracket: s.toCharArray()){
            if(bracket == '(' || bracket == '{' || bracket == '[') {
                openBracket.push(bracket);
            } else if (openBracket.isEmpty()) {
                return false;
            } else if (bracket == ')' && openBracket.peek() == '(') {
                openBracket.pop();
            } else if (bracket == '}' && openBracket.peek() == '{') {
                openBracket.pop();
            } else if (bracket == ']' && openBracket.peek() == '[') {
                openBracket.pop();
            } else {
                return false;
            }
        }
        return openBracket.isEmpty();
    }
}