import java.util.Scanner;

class Calculator{
  public int add(int n1, int n2){
    int r = n1 + n2;
    return r;
  }
  
  public int subtract(int n1,int n2){
    int r = n1-n2;
    return r;
  }

  public int multiply(int n1, int n2){
    int r = n1*n2;
    return r;
  }

  public int divide(int n1, int n2){
    int r = n1/n2;
    return r;
  }
}

public class object{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter first number: ");
    int num1 = input.nextInt();
    System.out.print("Enter Second number: ");
    int num2 = input.nextInt();

    Calculator calc = new Calculator();
    int sum = calc.add(num1,num2);
    int difference = calc.subtract(num1,num2);
    int product = calc.multiply(num1,num2);
    int quotient = calc.divide(num1,num2);

    System.out.println("The sum of "+num1+" and "+num2+" is : "+sum);
    System.out.println("The sum of "+num1+" and "+num2+" is : "+difference);
    System.out.println("The sum of "+num1+" and "+num2+" is : "+product);
    System.out.println("The sum of "+num1+" and "+num2+" is : "+quotient);

  }
}