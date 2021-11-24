package strings;

public class DuplicateString {
    public static void main(String[] args) {

        String str = "system";
        StringBuilder stringBuilder = new StringBuilder(str);

        for (int i = 0; i < stringBuilder.length(); i++) {
            for (int j = i + 1; j < stringBuilder.length(); j++) {
                if (stringBuilder.charAt(i) == stringBuilder.charAt(j)) {
                    stringBuilder.deleteCharAt(i);
                }
            }
        }
        System.out.println(stringBuilder);
    }
}
