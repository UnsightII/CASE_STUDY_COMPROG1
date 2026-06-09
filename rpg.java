import java.util.Scanner;
import java.util.Random;
class Character{
  public void attributes(String name,int hp,int atk){
    System.out.println("================================");
    System.out.println("Your Character name: "+name);
    System.out.println("HP: "+hp);
    System.out.println("attack: "+atk);
  }
}

class pet{
  public void attributes(String name,String hunger,String Happy){
  System.out.println("================================");
  System.out.println("Your pet name: "+name);
  System.out.println("Hunger: "+hunger);
  System.out.println("Happiness: "+Happy);
  }
}

class Student {
  public void attributes(String name,double grade){
  System.out.println("================================");
  System.out.println("Your student name: "+name);
  System.out.println("Grade: "+grade);
  }
}

public class rpg{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    Random random = new Random();

    String name;
    boolean isRunning = true;
    
    while(isRunning){
    System.out.println("Choose what you want: ");
    System.out.println("1.Character");
    System.out.println("2.Pet");
    System.out.println("3.Student");
    System.out.println("4.Exit");
    System.out.print("Enter your Choice: ");
    int choice = input.nextInt();
    input.nextLine();

    switch(choice){
      case 1:
        System.out.print("Character name: ");
        name = input.nextLine();
        int hp = random.nextInt(20);
        int atk = random.nextInt(10);

        Character charac = new Character();
        charac.attributes(name,hp,atk);
        break;
      case 2:
        System.out.print("Pet name: ");
        name = input.nextLine();
        System.out.print("Pet hunger: ");
        String hunger = input.nextLine();
        System.out.print("Pet happiness: ");
        String happy = input.nextLine();

        pet pet = new pet();
        pet.attributes(name,hunger,happy);
        break;
      case 3:
        System.out.print("Student name: ");
        name = input.nextLine();
        System.out.print("Grade: ");
        double grade = input.nextDouble();

        Student student = new Student();
        student.attributes(name,grade);
        break;
      case 4:
        isRunning = false;
        break;
      default:
        System.out.println("Invalid Input.Pls try again!.");
      }
    }
  }
}