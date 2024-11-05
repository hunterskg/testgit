
public class MyString implements IString {

    public static boolean kt(String s) {
        int n = s.length();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int f1(String string) {
        String[] word = string.split("\\s+");
        int count = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < word.length; i++) {
            if (min > word[i].length()) {
                min = word[i].length();
            }

        }
        for (int i = 0; i < word.length; i++) {
            if (word[i].length() == min && kt(word[i])) {
                count++;
            }
        }
        return count;
    }
    //aa bb cc dddd eeee sdvgd as

    @Override
    public String f2(String string) {
        String[] word = string.split("\\s+");
        String max = word[0];
        for (int i=0;i<word.length;i++){
            if (word[i].length()>max.length() && kt(word[i])){
                max = word[i];
            }
        }
        return max;
    }

}
//aa bb ccc ddd eee sdvgds as