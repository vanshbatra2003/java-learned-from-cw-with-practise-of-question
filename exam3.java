import java.util.Scanner;

// public class exam3 {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int pw=1;
//         int ans=0;
//         while(n>0){
//             int unitdigit=n%10;
//             ans+=unitdigit*pw;
//             n/=10;
//             pw*=2;
//         }
//         System.out.print(ans);
//     }
// }


public class exam3{
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        int n=1101;
        int ans=0;
        int pw=1;
        while(n>0){
            int parity=n%2;
            ans+=(parity*pw);
            pw*=2;
            n/=10;
        }
        System.out.println(ans);
    }
}