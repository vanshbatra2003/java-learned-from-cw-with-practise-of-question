import java.util.*;
// public class exam1 {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
       
//         int nod=0;
//         int n=sc.nextInt(); 
//         int x=n;
//         while(x>0){
//             nod+=x%10;
//             x/=10;
//             // x/=10;
//         }
//         System.out.println(nod);
//     }
// }


// reversee no 
// public class exam1{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         int nod=0;
//         int n=sc.nextInt(); 
//         int x=n;    
//         while(n>0){
//             nod=nod*10+n%10;
//             n/=10;
//         }
//         System.out.println(nod);
//     }
// }

// sum of following series 
// public class exam1{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         int nod=0;
//         int n=sc.nextInt(); 
//         int x=n; 
//         for(int i=1;i<=n;i++){
//             if(i%2==0){
//                 nod-=i;
//             }
//             else{
//                 nod+=i;
//             }
//         }
//         System.out.println(nod);   
//     }
// }

// foctorial 
// public class exam1{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         int nod=1;
//         int n=sc.nextInt(); 
//         int x=n;   
//         for(int i =1;i<=n;i++){
//             nod*=i;       
//             System.out.println("factorial of "+ i + " is "+ nod);
//         } 

//     }
// }

// a raise to the power b 
public class exam1{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a=sc.nextInt(); 
        int b=sc.nextInt();
        int ans=1;
        for(int i =1;i<=b;i++){
            ans*=a;
        } 
        System.out.println(ans);
    }
}