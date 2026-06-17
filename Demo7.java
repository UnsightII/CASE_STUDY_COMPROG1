public class Demo7 {

    public static StringBuffer repeatWord(String word) {
        StringBuffer sb = new StringBuffer();

        for (int i = 1; i <= 3; i++) {
            sb.append(word);
            sb.append(" ");
        }

        return sb;
    }

    public static void main(String[] args) {
        System.out.println(repeatWord("Java"));
    }
}

