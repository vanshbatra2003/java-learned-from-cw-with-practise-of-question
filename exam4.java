class student{
    int roll_no;
    String student_name;
}
public class exam4 {
    public static void main(String[] args) {
        student obj1=new student();
        obj1.roll_no=1500;
        obj1.student_name= "Vansh";
        System.out.println(obj1.roll_no);
        System.out.println(obj1.student_name);

        student obj2=new student();
        obj2.roll_no=1519;
        obj2.student_name="Vanshit";
        System.out.println(obj2.roll_no);
        System.out.println(obj2.student_name);
    }
}
