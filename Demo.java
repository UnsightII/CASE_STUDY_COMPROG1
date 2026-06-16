import java.util.Scanner;
public class Demo{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);

    StringBuffer sb = new StringBuffer("Navin");
    sb.append("Reddy");
    sb.insert(7,"Java");
    System.out.println(sb);


  }
}