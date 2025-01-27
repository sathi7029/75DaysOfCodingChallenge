class Solution {
    public String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();
        StringBuilder currentString = new StringBuilder();
        int k = 0;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                k = k * 10 + (c - '0');
            } else if (c == '[') {
                
                countStack.push(k);
                stringStack.push(currentString.toString());
                currentString = new StringBuilder(); 
                k = 0; // Reset k
            } else if (c == ']') {
                // Pop k and the previous string, then decode the current string
                int count = countStack.pop();
                StringBuilder decodedString = new StringBuilder(stringStack.pop());
                for (int i = 0; i < count; i++) {
                    decodedString.append(currentString);
                }
                currentString = decodedString; // Update the current string
            } else {
                // Append characters to the current string
                currentString.append(c);
            }
        }
        return currentString.toString();
    }
}