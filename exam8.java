// public class exam8 {
//     public static void main(String[] args) {
//         int  a=9;
//         int b=4;
//         a=a+b;
//         b=a-b;
//         a=a-b;
//         System.out.println(a+" and "+b);
//     }
// }

// public class exam8{
//     public static void main(String[] args) {
//         int [] arr={1,2,3,4,5};
//         for(int i =arr.length-1;i>=0;i--){
//             System.out.println(arr[i]);
//         }
//     }
// }

public class exam8 {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            if(arr[left]%2==1&& arr[right]%2==0){
                int temp =arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
            }
            if(arr[left]%2==0){
                left++;
            }
            if(arr[right]%2==1){
                right--;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}