
// ye sum ka tha 

// import java.util.*;
// public class video24{
//     static void add2darr(int a[][],int n,int m,int b[][],int one,int two){
//         if(n!=one || m!=two){
//             System.out.println("wrong input addition can only perform on arr with same row and column");
//             return;
//         }
//         int sum[][]=new int [n][m];
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 sum[i][j]=a[i][j]+b[i][j];
//             }
//         }
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 System.out.print(sum[i][j]+" ");
//             }
//             System.out.println();
//         }
//         return;
        
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int m=sc.nextInt();
//         int arr [][]=new int [n][m];
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 arr[i][j]=sc.nextInt();
//             }
//         }
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 System.out.print(arr[i][j]+" ");
//             }
//             System.out.println();
//         }
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         int arr2 [][]=new int [a][b];
//         for(int i=0;i<a;i++){
//             for(int j=0;j<b;j++){
//                 arr2[i][j]=sc.nextInt();
//             }
//         }
//         for(int i=0;i<a;i++){
//             for(int j=0;j<b;j++){
//                 System.out.print(arr2[i][j]+" ");
//             }
//             System.out.println();
//         }
//         add2darr(arr, n, m, arr2, a, b);
//     }
// }




// ye multiply ka h

import java.util.*;
public class video24{
    static void multiply2d(int a[][],int n,int m,int b[][],int one,int two){
        if(n!=two){
            System.out.println("multiply can not done");
            return;
        }
        int multiply [][]=new int [n][two];
        for(int i=0;i<n;i++){
            for(int j=0;j<two;j++){
                for(int k=0;k<one;k++){
                    multiply[i][j]+=(a[i][k]*b[k][j]);
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<two;j++){
                System.out.print(multiply[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr [][]=new int [n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int a=sc.nextInt();
        int b=sc.nextInt();
        int arr2 [][]=new int [a][b];
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                arr2[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
        multiply2d(arr, n, m, arr2, a, b);
    }
}