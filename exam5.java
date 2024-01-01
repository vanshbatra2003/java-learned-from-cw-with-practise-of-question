import java.util.*;
class algebra{
    int a;
    int b;
    int algebra(int x,int y){
        System.out.println("constructor of algebra class called");
        a=x;
        b=y;
    }
    int add(int a,int b){
        int ans=a+b;
        return ans;
    }
    int sub(){
        return a-b;
    }
    int mul(){
        return a*b;
    }
}
public class exam5 {
    public static void main(String[] args) {
        // algebra obj=new algebra();
        // Scanner sc=new Scanner(System.in);
        // int x=sc.nextInt();
        // int y=sc.nextInt();
        // obj.add(x,y);
        // System.out.println(obj.add(x,y));

        System.out.println(Math.sqrt(24));
        System.out.println(Math.sqrt(16));
        System.out.println(Math.floor(5.3));
        System.out.println(Math.floor(5.8));
        System.out.println(Math.ceil(5.3));
        System.out.println(Math.ceil(5.8));
    }
}
