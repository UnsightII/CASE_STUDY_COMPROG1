import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class StackAndQueue {
  public static void main(String[]args){
  Scanner input = new Scanner(System.in);
  Stack<Character>stack = new Stack<>();
  Stack<Character>stackClone = new Stack<>();
  Queue<Character>queue = new LinkedList<>();
  Queue<Character>queueClone = new LinkedList<>();
  char choice;
  String word;
  boolean isRunning = true;

  System.out.print("Enter any text: ");
  word = input.nextLine().toUpperCase();

  for(char c : word.toCharArray()){
    stack.push(c);
    queue.add(c);
  }
  //MENU
  System.out.println("\nMenu");
  System.out.println("A. Display the String");
  System.out.println("B. Pop");
  System.out.println("C. Top");
  System.out.println("D. Push/Enqueue");
  System.out.println("E. Dequeue");
  System.out.println("F. Front");

  while(isRunning){
    System.out.print("Enter a choice from the menu[press X to exit program]: ");
    choice = input.next().toUpperCase().charAt(0);

    switch(choice){

      case 'A':
        for(char c : queue){
          System.out.print(" "+c);
        }
        break;

      case 'B':
        if(stack.isEmpty()){
          System.out.print("Empty!");
        }else{
          stack.pop();

          while(queue.size() > 1){
            queueClone.add(queue.poll());
          }
          queue.poll();
          queue = queueClone;
          System.out.println("Removed.");
        }
        break;

      case 'C':
        if(stack.isEmpty()){
          System.out.print("Empty!");
        }else{
          System.out.print("TOP :"+stack.peek());
        }
        break;

      case 'D':
        System.out.print("Enter a character: ");
        char c = input.next().toUpperCase().charAt(0);
        stack.push(c);
        queue.add(c);
        System.out.println("Added");
        break;

      case 'E':
        if(stack.isEmpty()){//check if empty
          System.out.print("Empty!");
        }else{
          queue.poll();
          while(stack.size()>1){
            stackClone.push(stack.pop());
          }
          stack.pop();
          while(!stackClone.isEmpty()){
            stack.push(stackClone.pop());
          }
        }
        break;
        
      case 'F':
        if(stack.isEmpty()){
          System.out.print("Empty!");
        }else{
          System.out.print("FRONT: "+queue.peek());
        }
        break;

      case 'X':
        isRunning = false;
        break;
        
      default:
        System.out.print("Invalid choice. Please select from A-F or X.");
        break;
      }
      System.out.println();
    }
    input.close();
  }  
}
