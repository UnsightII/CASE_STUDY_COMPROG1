import java.util.Scanner;
public class method{
  public static void main(String[]args){
  Scanner input = new Scanner(System.in);
  double height;
  double weight;

  System.out.print("Enter your height (in cm): ");
  height = input.nextDouble();
  System.out.print("Enter your weight (in kilograms): ");
  weight = input.nextDouble();

  calculateBMI(height,weight);

  input.close();
  }
  public static void calculateBMI(double height,double weight){
    double bmi = (weight/(height*height))*10000;
        //BMI CATEGORY
    System.out.printf("BMI : %.2f",bmi);
    System.out.print("\nCategory: ");
    if(bmi < 18.5 ){
      System.out.print("Underweight");
    }else if(bmi >= 18.5 && bmi <= 24.9){
      System.out.print("Normal weight");
    }else if(bmi >= 25 && bmi <= 29.9){
      System.out.print("Overweight");
    }else if(bmi >= 30){
      System.out.print("Obesity");
    }
  }
}