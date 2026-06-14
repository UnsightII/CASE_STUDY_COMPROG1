import java.util.Scanner;
public class exercise {
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter your password: ");
    String pass = input.nextLine();

    boolean result = isValidPass(pass);

    if(result){
      System.out.println("Your Password is Valid");
    }else{
      System.out.println("Your Password is invalid");
    }
  }
  public static boolean isValidPass(String pass) {
    boolean isNum = false;
    boolean isChar = false;

    for(int i = 0; i < pass.length(); i++) {
        char c = pass.charAt(i);

        if(Character.isLetter(c)) {
            isChar = true;
        }

        if(Character.isDigit(c)) {
            isNum = true;
        }
    }

    return isNum && isChar;
  }
}

    /*System.out.print("Enter First number: ");
    int num1 = input.nextInt();
    System.out.print("Enter Second number: ");
    int num2 = input.nextInt();
    System.out.print("Enter third number: ");
    int num3 = input.nextInt();

    int result = findLargest(num1,num2,num3);

    System.out.println("The largest number is "+result);
    */
  

  /*public static int findLargest(int num1, int num2,int num3){
    if(num1 > num2 && num1 > num3){
      return num1;
    }else if(num2 > num1 && num2 > num3){
      return num2;
    }else{
      return num3;
    }
  }
  */
  /*public static void checkEvenOdd(int num){
  if(num % 2 == 0){
    System.out.print(num+" is even");
  }else{
    System.out.print(num+" is odd");
  }

  }*/


