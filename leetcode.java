// import java.util.Arrays;
// import java.util.*;

// public class leetcode {
//     public static void main(String[] args) {
//         int arr1 []={1,2,3,2,1};
//         int arr2 []={3,2,1,4,7};
//         int count1=0;
//         int count2=0;
//         Arrays.sort(arr1);
//         Arrays.sort(arr2);
//         for(int i =0;i<arr1.length;i++){
//             for(int j=0;j<arr2.length;j++){
//                 if(arr1[i]==arr2[j]){]
//                     count1++;
//                 }
//                 if(count1>=count2){
//                     count2=count1;
//                 }
//             }
//         }
//         System.out.println(count2);
//     }
// }

// import java.util.*;
// public class leetcode{
//     public static void main(String[] args) {
//         int arr1 []={1,2,3,4,6};
//         int arr2 []={2,3,5};
//         int arr3=new int [arr1.length];
//         for(int i =0;i<arr1.length;i++){
//             for(int j=0;j<arr2.length;j++){
//                 if (arr1[i]==arr2[j]) {
//                     arr3=arr1[i];
//                 }
//             }
//         }
//         for(int i=0;i<arr3.length;i++){
//             System.out.print(arr3[i]+" ");
//         }
//     }
// }

// public class leetcode{
//     public static void main(String[] args) {
//         int arr []={9,7,6,5,4,3};
//         for(int i=0;i<arr.length-1;i++){
//             for(int j=0;j<arr.length-i-1;j++){
//                 if(arr[j]>arr[j+1]){
//                     int temp=arr[j];
//                     arr[j]=arr[j+1];
//                     arr[j+1]=temp;
//                 }
//             }
//         }
//         for(int i =0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
// }

// import java.util.Scanner;

// public class leetcode{
//     public static void main(String[] args) {
//         int n=42;
//         for(int i=2;i<=n;i++){
//             while(n%i==0){
//                 System.out.print(i+" ");
//                 n/=i;
//             }
//         }
//     }
// }

import java.util.Scanner;

public class leetcode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String key = sc.next();
        System.out.print(str.indexOf(key));
    }
}