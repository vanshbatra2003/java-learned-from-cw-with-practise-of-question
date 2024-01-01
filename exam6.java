import java.util.*;
public class exam6 {
    public static void main(String[] args) {
    //     int [] arr={1,3,5,7,2,4,6};
    //     int ans =0;
    //     for(int i =0;i<arr.length-1; i++){
    //         arr[i]=ans;
    //         if(arr[i]<arr[i+1]){
    //             ans=arr[i+1];
    //         }
            
    //     }
    //     System.out.println(ans);
    // }


    int [] arr={1,3,5,7,2,4,6};
    int key =8;
    for(int i =0;i<arr.length;i++){
        if(arr[i]==key){
            System.out.println(i);
            break;
        }
        else{
            System.out.println("-1");
            break;
        }
        
    }}}


