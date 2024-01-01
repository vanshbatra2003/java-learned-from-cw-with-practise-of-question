import java.util.*;
public class TWOd_array {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    // int [][]arr={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
    // int start_row=0;
    // int start_col=0;
    // int end_row=arr.length-1;
    // int end_col=arr.length-1;
    // for(int a=start_col;a<end_col;a++){
    //     System.out.print(arr[start_row][a]);
    // }

    // StringBuilder sb=new StringBuilder("tony");
    // for(int i =sb.length()-1;i>=0;i--){
    //     System.out.print(sb.charAt(i));
    // }
    // reverse the stringbuilder code
    // int [] arr={1,3,5,4,2};
    // for(int i=0;i<arr.length;i++){
    //     for(int j=0;j<arr.length;j++){
            
    //     if(arr[j]<arr[j+1]){
    //        int temp=arr[j];
    //         arr[j]=arr[j+1];
    //         arr[j+1]=temp;
    //     }
    // }
    //     }
        
    // for(int i=0;i<arr.length;i++){
    //     System.out.println(arr[i]);
    // }
    int[] arr = {1, 3, 5, 4, 2};

for (int i = 0; i < arr.length - 1; i++) {
    for (int j = i+1; j < arr.length; j++) {
        if(arr[j]<arr[i]){
            int temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
        }
    }
}
for (int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}
    }
}