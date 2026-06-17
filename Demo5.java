public class Demo5 {

    public static StringBuffer formatNumber(String num) {
        StringBuffer sb = new StringBuffer(num);

        sb.insert(4, "-");
        sb.insert(8, "-");

        return sb;
    }

    public static void main(String[] args) {
        System.out.println(formatNumber("09171234567"));
    }
}

