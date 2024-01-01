import java.util.*;
public class practise1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        // int b=sc.nextInt();
        // int c=sc.nextInt();
        // System.out.println(three_avg(a, b, c));

        // System.out.println(sumOfOddNumber(a));

        // System.out.println(maxTwoNumber(a, b));

        System.out.println(loo(a));
    }
    public static int three_avg(int a,int b,int c){
        return (a+b+c)/3;
    }
    public static int sumOfOddNumber(int a){
        int sum=0;
        for(int i=1;i<=a;i++){
            if(i%2!=0){
                sum+=i;
            }
        }
        return sum;
    }
    public static int maxTwoNumber(int a,int b){
        int max=Math.max(a, b);
        return max;
    }
    public static int loo(int a){
        for(;;){
            System.out.println(a);
        }
    }
}