import java.util.Scanner;

// public class exam2 {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         for(int row=1;row<=n;row++){
//             for(int space=1;space<=n-row;space++){
//                 System.out.print(" ");
//             }
//             for(int star=1;star<=row;star++){
//                 System.out.print("*");
//             }
//             for(int hash=2;hash<=row;hash++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }



// public class exam2{
//     public static void main(String[] args) {
//         int n=7;
//         for(int i=1;i<=n;i++){
//             for(int j=i;j<=n;j++){
//                 System.out.print(j);
//             }
//             for(int k=1;k<=i-1;k++){
//                 System.out.print(k);
//             }
//             System.out.println();
//         }
//     }
// }

// public class exam2{
//     public static void main(String[] args) {
//         int n=5;
//         int count=1;
//         for(int row=1;row<=n;row++){
//             for(int star=1;star<=n;star++){
//                 System.out.print(count);
//                 count++;
//             }
//             count=1;
//             System.out.println();
//         }
//     }
// }

// public class exam2{
//     public static void main(String[] args) {
//         int n=6;
//         for(int row=1;row<=n;row++){
//             for(int star=1;star<=n;star++){
//                 if((row+star)%2==0){
//                     System.out.print(1);
//                 }
//                 else{
//                     System.out.print(0);
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

// public class exam2{
//     public static void main(String[] args) {
//         int n=4;
//         int count=1;
//         for(int row=1;row<=n;row++){
//             for(int star=1;star<=row;star++){
//                 System.out.print(count);
//                 count++;
//             }
//             count=1;
//             System.out.println();
//         }
//     }
// }


public class exam2{
    public static void main(String[] args) {
        int n=4;
        int count =1;
        for(int row=1;row<=n;row++){
            for(int space=1;space<=n-row;space++){
                System.out.print(" ");
            }
            for(int star=1;star<=2*row-1;star++){
                if(star<row){
                    System.out.print(count);
                    count++;
                }
                else{
                    System.out.print(count);
                    count--;
                }
            }
            count=1;
            System.out.println();
        }
    }
}