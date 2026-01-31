class Leetcode744 {
    public char nextGreatestLetter(char[] letters, char target) {
        char mini = '{';
        for(char c : letters)
            if(c>target && c<mini)
                    mini = c;
        return mini=='{'?letters[0]:mini;
    }
}
