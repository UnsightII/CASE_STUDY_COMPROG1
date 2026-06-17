public class Demo6 {

    public static StringBuffer removeSpaces(String text) {
        StringBuffer sb = new StringBuffer(text);

        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == ' ') {
                sb.deleteCharAt(i);
                i--;
            }
        }

        return sb;
    }

    public static void main(String[] args) {
        System.out.println(removeSpaces("I Love Java"));
    }
}

