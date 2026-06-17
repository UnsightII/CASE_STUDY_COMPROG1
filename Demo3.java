public class Demo3 {
    public static void main(String[] args) {

        String word = "level";

        StringBuffer sb = new StringBuffer(word);
        String reversed = sb.reverse().toString();

        if (word.equals(reversed)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}

