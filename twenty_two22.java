import java.util.Scanner;

public class twenty_two22 {
    public static void reverseArray(int arr []){
        int n=arr.length;
        for(int i=n-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
    public static void sortedSquareArray(int arr[]){
        int n=arr.length;
        int left=0;
        int right=n-1;
        int ans []=new int [n];
        int k=0;
        while(left<=right){
            if(Math.abs(arr[left])>Math.abs(arr[right])){
                ans[k++]=arr[left]*arr[left];
                left++;   
            }
            else{
                ans[k++]=arr[right]*arr[right];
                right--;
            } 
        }
        reverseArray(ans);
        // printArray(ans);
    }

    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void evenOddSwap(int arr[]){
        int n=arr.length;
        int left=0;
        int right=n-1;
        while(left<right){
            if(arr[left]%2!=0 && arr[right]%2==0){
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
            }
            if(arr[left]%2==0){
                left++;
            }
            if(arr[right]%2!=0){
                right--;
            }
        }
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        int arr []=new int [n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        // sort 0's and 1's in of array
        // for(int i =0;i<arr.length;i++){
        //     if(arr[i]==0){
        //         count++;
        //     }
        // }
        // for(int i =0;i<arr.length;i++){
        //     if(i<count){
        //         arr[i]=0;
        //     }
        //     else{
        //         arr[i]=1;
        //     }
        // }
        // for(int i =0;i<arr.length;i++){
        //     System.out.print(arr[i]+" ");
        // }
        // or
        // int left=0;
        // int right=n-1;
        // while(left<right){
        //     if(arr[left]==1 && arr[right]==0){
        //         int temp=arr[left];
        //         arr[left]=arr[right];
        //         arr[right]=temp;
        //     }
        //     if(arr[left]==0){
        //         left++;
        //     }
        //     if(arr[right]==1){
        //         right--;
        //     }
        // }
        // for(int i =0;i<arr.length;i++){
        //     System.out.print(arr[i]+" ");
        // }

        // even at start and odd at end 
        // evenOddSwap(arr);
        // printArray(arr);



        // sort square arrays
        sortedSquareArray(arr);


    }
}


// swaping two element 
// a=a+b
// b=a-b
// a=a-b
// and 
// by using temp


