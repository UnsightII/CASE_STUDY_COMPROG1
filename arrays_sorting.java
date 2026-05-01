import java.util.Scanner;
public class arrays_sorting{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    int size;
    char choice;
    boolean isRunning = true;
    //Ask the user how many integer
    System.out.print("Enter number of integers: ");
    size = input.nextInt();
    int[] num = new int[size];
    // Ask the user to enter integer
    for(int i = 0;i<size;i++){
      System.out.print("Enter number "+(i+1)+": ");
      num[i] = input.nextInt();
    }
      // MENU
      System.out.println("\nMenu: ");
      System.out.println("1. Dispay the numbers.");
      System.out.println("2. Dispay the values of even indexes.");
      System.out.println("3. Dispay the values of odd indexes.");
      System.out.println("4. Dispay the values in ascending order.");
      System.out.println("5. Dispay the values in descending order.");
    
    while(isRunning){
      System.out.print("\nEnter a choice from the menu[Press X to exit program]: ");
      choice = Character.toUpperCase(input.next().charAt(0));

      switch(choice){
        case '1':
          System.out.print("Values Display:");
          for(int n :num){
            System.out.print(" "+n);
          }
          break;
        case '2':
          System.out.print("Values at even indexes: ");
          for(int i = 0;i<num.length;i+=2){
            System.out.print(" "+num[i]);
          }
          break;
        case '3':
          System.out.print("Values at odd indexes: ");
          for(int i = 1;i<num.length;i+=2){
            System.out.print(" "+num[i]);
          }
          break;
        case '4':
          ascendingOrder(num);
          System.out.print("Values in ascending order:");
          for(int n:num){
            System.out.print(" "+n);
          }
          break; 
        case '5':
          descendingOrder(num);
          System.out.print("Values in descending order:");
          for(int n:num){
            System.out.print(" "+n);
          }
          break; 
        case 'X':
          isRunning = false;
          break;
        default:
          System.out.print("Invalid choice. Please select from 1-5 or X.");       
      }
      System.out.println();
    }
    input.close();
  }
  public static void ascendingOrder(int[] num){
    for(int i = 0;i<num.length - 1;i++){
      for(int j = 0;j<num.length - 1 - i;j++){
        if(num[j] > num [j+1]){
          int temp = num[j];
          num[j] = num[j+1];
          num[j+1] = temp;
        }
      }
    }
  }
  public static void descendingOrder(int[] num){
    for(int i = 0;i<num.length - 1;i++){
      for(int j = 0;j<num.length - 1 - i;j++){
        if(num[j] < num [j+1]){
          int temp = num[j];
          num[j] = num[j+1];
          num[j+1] = temp;
        }
      }
    }
  }
}