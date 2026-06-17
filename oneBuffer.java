public class oneBuffer {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Hello");

        sb.append(" World");      // Add text
        sb.insert(5, ",");        // Insert text
        sb.replace(0, 5, "Hi");   // Replace text
        sb.delete(2, 3);          // Delete character
        sb.reverse();             // Reverse string

        System.out.println(sb);
    }
}
