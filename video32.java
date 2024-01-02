import java.util.*;
public class video32 {
    static int factorial(int n){
        if(n==0){
            return 1;
        }
        // int small=factorial(n-1);
        // int ans=n*small;
        // return ans; 
        // or
        return(n*factorial(n-1));   
    }
    static int fibonacci(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return(fibonacci(n-1)+fibonacci(n-2));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(factorial(n));
        System.out.println(fibonacci(n));
    }    
}