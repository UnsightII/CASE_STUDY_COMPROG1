import java.util.Random;
import java.util.Scanner;
public class Array{
  public static void main(String[]args){
    Scanner input = new Scanner (System.in);
    Random rand = new Random();
    int nums[][] = new int[3][];

    nums[0] = new int[3];
    nums[1] = new int[4];
    nums[2] = new int[2];

    for(int i = 0;i<nums.length;i++){
      for(int j = 0;j<nums[i].length;j++){
        nums[i][j] = rand.nextInt(10);
      }
    }

    for(int num[] : nums){
      System.out.println();
      for(int m : num){
      System.out.print(" "+m);
      }
    }
  }
}