public class Demo1 {

    public static StringBuffer fullName(String firstName) {
        StringBuffer sb = new StringBuffer(firstName);
        sb.append(" Cruz");
        return sb;
    }

    public static void main(String[] args) {
        System.out.println(fullName("Juan"));
    }
}

