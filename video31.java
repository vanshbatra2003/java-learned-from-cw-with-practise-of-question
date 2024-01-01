import java.util.*;
public class video31 {
    static void increasingNo(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        increasingNo(n-1);
        System.out.println(n);
    }
    static void decreasingNo(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        System.out.print(n+" ");
        decreasingNo(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        // increasingNo(n);
        decreasingNo(n);
    }
}
