class Mobile{
  String brand;
  int price;
  static String name;

  public void Show(){
    System.out.println(brand+" : "+price+" : "+name);
  }

  public static void Show1(Mobile obj){
    System.out.println(obj.brand+" : "+obj.price+" : "+name);
  }

}
public class statics{
  public static void main(String[]args){

    Mobile obj1 = new Mobile();
    obj1.brand = "Apple";
    obj1.price = 10;
    Mobile.name = "Smartphone";

    Mobile obj2 = new Mobile();
    obj2.brand = "Samsung";
    obj2.price = 15;
    Mobile.name = "Tablet";

    Mobile.name = "Phone";

    obj1.Show();
    obj2.Show();

    Mobile.Show1(obj1);
  }
}
