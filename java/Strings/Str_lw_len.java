class Str_lw_len {
    public int lengthOfLastWord(String s) {
        int length = 0;
        int i = s.length() - 1;
        // Skip spaces from the end
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }
        // Count characters of last word
        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }
        return length;
    }
}

/*
String s = " Hello  World ";
s.length() = 14  => i=14-1=13
|   | H | e | l | l | o |   |   | W | o | r | l | d  |   |
| 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 | 11  | 12  | 13  |
last index is empty so, i-- =>12
length from d-w is '5'
again do i-- =>7
i-- =>6

*/