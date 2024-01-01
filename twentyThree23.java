import java.util.*;
public class twentyThree23 {
    public static int findArraySum(int arr []){
        int totalsum=0;
        for(int i =0;i<arr.length;i++){
            totalsum+=arr[i];
        }
        return totalsum;
    }
    public static void rangeSum(int r,int l,int arr[]){    
        int ans=arr[r-1]-arr[l-2];
        System.out.print(ans);
    }
    public static void suffixSum(int arr []){
        int n=arr.length;
        arr[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            arr[i]=arr[i]+arr[i+1]; 
        }
        printArray(arr);
    }
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void prefixSumArray(int arr []){
        int n=arr.length;
        arr[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i]=arr[i]+arr[i-1];
        }
        printArray(arr);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr []=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        // prefixSumArray(arr);
        // int l=sc.nextInt();
        // int r=sc.nextInt();
        // rangeSum(r, l, arr);
        // suffixSum(arr);
        int totalsum=findArraySum(arr);
        int prefSum=0;
        for(int i=0;i<arr.length;i++){
            prefSum+=arr[i];
            int suffSum=totalsum-prefSum;
            if(prefSum == suffSum){
                System.out.print("true");
                return;
            }
        }
        System.out.print("flase");
    }    
} 