public class Demo2 {
    public static StringBuffer replaceWord(String word) {
        StringBuffer sb = new StringBuffer(word);
        sb.replace(0, word.length(), "Java");
        return sb;
    }

    public static void main(String[] args) {
        System.out.println(replaceWord("Python"));
    }
}

