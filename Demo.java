class Computer{
  public void playMusic(){
    System.out.println("Music is playing...");
  }
  public String getMePen(int cost){
    if(cost >= 2){
      return "Pen";
    }else{
      return "Not enought!";      
    }
  }
}

class Door{
  public String openDoor(int key){
    if(key == 1234){
      return "Your password is Correct";
    }
    return "Your password is Wrong";
  }
}

class ATM{
  public int withdraw(int balance,int amount){
    return balance + amount;
  }
}

class Pet{
  public String feed(String name){
    System.out.println("Name: "+name);
    return "Dog is Eating...";
  }

  public String play(String name){
    System.out.println("Name: "+name);
    return "Dog is playing...";
  }
  
  public String sleep(String name){
    System.out.println("Name: "+name);
    return "Dog is sleeping";
  }
}
public class Demo{
  public static void main(String[]args){

    /*Computer obj = new Computer();
    obj.playMusic();
    String str = obj.getMePen(1);
    
    System.out.println(str);
    Door obj = new Door();
    String str = obj.openDoor(1235);
    */

    Pet obj = new Pet();
    String dog1 = obj.feed("andrew");
    System.out.println(dog1);
    String dog2 = obj.play("josh");
    System.out.println(dog2);
    String dog3 = obj.sleep("bryan");
    System.out.println(dog3);
    
    
    
  }
}