import java.util.Scanner;
public class arrays {
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    int[] num = new int[6];
    int[] winNum = new int[6];
    int i = 0;
    int random = 0;
    int win = 0;
    boolean isValid = true;

      while(isValid){
        System.out.print("Enter number "+(i+1)+": ");//for user input 
        int temp = input.nextInt();

      
        if(temp > 0 && temp <= 42){//store the num array
          boolean isDuplicate = false;
          for(int j=0;j<i;j++){
            if(temp == num[j]){
              isDuplicate = true;
              break;
            }
          }
          if(isDuplicate){
            System.out.println("No Duplicate!.Pls try again.");
          }else{
            num[i] = temp;
            i++;
          }
        }else{          
          System.out.println("Invalid Input!.Pls try again.");//For invalid input
        }
        if(i == 6 ){//to exit when the array is full
          isValid = false;
        }
      }

      // For random winning number
      for(i = 0;i<6;i++){
        boolean isDuplicate = false;
        random = (int)(Math.random() * 42)+1; //Generate number to 1 - 42;
        for(int j = 0;j<i;j++){ // Check if Duplicate
          if(random == winNum[j]){
            isDuplicate = true;
          }
        }
        
        if(isDuplicate){
          i--; // the iteration will repeat
        }else{
          winNum[i] = random;
        }
      }

      // for win 
      for(i = 0;i<6;i++){
        for(int j =0;j<6;j++){
          if(num[i] == winNum[j]){
            win++;
          }
        }
      }
      //OUTPUT
      System.out.println("========================================");
      System.out.println("\t\tLOTTO ");
      System.out.println("----------------------------------------");
      System.out.print("Your 6 numbers bet: ");
      for(int n : num){
        System.out.print(" "+n);
      }

      System.out.print("\nWinning numbers:    ");
      for(int n : winNum){
        System.out.print(" "+n);
      }
      System.out.println("\n----------------------------------------");
      System.out.println("MATCHED NUMBERS: "+ win +" out of 6");
      System.out.println("STATUS: " + (win >= 3 ? "WINNER!" : "LOSE"));

      // for prize
      if(win == 6){ 
        System.out.print("Prize: P 31,621,223.97");
      }else if(win == 5){
        System.out.print("Prize: P 25,000.00");
      }else if(win == 4){
        System.out.print("Prize: P 1,000.00");
      }else if(win == 3){
        System.out.print("Prize: P 20.00");
      }else{
        System.out.println("No prize");
      }
      System.out.println("========================================");
      input.close();
  }
}
