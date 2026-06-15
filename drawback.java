class Student{
  int rollno;
  String name;
  int mark;
}
public class drawback {
  public static void main(String[]args){

    // Student s1 = new Student();
    // s1.rollno = 1;
    // s1.name = "Gar";
    // s1.mark = 90;

    // Student s2 = new Student();
    // s2.rollno = 2;
    // s2.name = "Andrew";
    // s2.mark = 80;

    // Student s3 = new Student();
    // s3.rollno = 3;
    // s3.name = "John";
    // s3.mark = 70;

    // Student student[] = new Student[3];
    // student[0] = s1;
    // student[1] = s2;
    // student[2] = s3;

    // for(int i = 0;i<student.length;i++){
    //   System.out.println(student[i].name+": "+student[i].mark);
    // }


    int[] nums = new int [4];

    nums[0] = 5;
    nums[1] = 2;
    nums[2] = 3;
    nums[3] = 1;

    for(int i = 0;i<nums.length;i++){
      System.out.print(" "+nums[i]);
    }
  }
}
