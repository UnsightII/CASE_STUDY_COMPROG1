public class SecBuffer{
    public static StringBuffer toUpper(String word) {
        StringBuffer sb = new StringBuffer(word.toUpperCase());
        return sb;
    }

    public static void main(String[] args) {
        System.out.println(toUpper("java"));
    }
}

