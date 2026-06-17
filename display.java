public class display{

    public static void showLength(String word) {
        StringBuffer sb = new StringBuffer(word);
        System.out.println("Length: " + sb.length());
    }

    public static void main(String[] args) {
        showLength("programming");
    }
}
