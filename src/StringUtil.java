public class StringUtil {
    private StringActions stringActions;

    public StringUtil() {
        stringActions = new StringActions() {
            @Override
            public String concate(String s1, String s2) {
                return s1 + s2;
            }

            @Override
            public int countChars(String word) {
                return word.length();
            }

            @Override
            public boolean findChar(String word, char letter) {
                return word.indexOf(letter) != -1;
            }

        };
    }

    public StringActions getStringActions() {
        return stringActions;
    }


}
