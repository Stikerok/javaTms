package lesson7.homeWork;

public class TextFormater {
    public static int countWord(String sentence) {
        int count = 1;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                count++;
            }
        }
        return count;
    }

    public static boolean checkPolindrom(String sentence) {
        String[] subStr = sentence.split(" ");
        for (String str : subStr) {
            StringBuilder builder = new StringBuilder(str);
            String str1 = builder.reverse().toString();
            if (str.equals(str1)) {
                return true;
            }
        }
        return false;
    }

    public static int censorText(String text, String blackWord) {
        String[] arrWord = text.split(" ");
        for (String word: arrWord) {
            if (word.equalsIgnoreCase(blackWord)) {
                System.out.println(text);
                return 1;
            }
        }
        return 0;
    }
}
