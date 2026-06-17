public class Demo4{

    public static StringBuffer createEmail(String name) {
        StringBuffer sb = new StringBuffer();

        sb.append(name);
        sb.append("@gmail.com");

        return sb;
    }

    public static void main(String[] args) {
        System.out.println(createEmail("andrew"));
    }
}