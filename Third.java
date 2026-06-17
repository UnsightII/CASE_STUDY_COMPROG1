public class Third{

    public static StringBuffer reverseWord(String word) {
        StringBuffer sb = new StringBuffer(word);
        sb.reverse();
        return sb;
    }

    public static void main(String[] args) {
        System.out.println(reverseWord("hello"));
    }
}

