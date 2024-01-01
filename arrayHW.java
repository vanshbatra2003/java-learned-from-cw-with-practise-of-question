import java.util.*;

import javax.swing.event.InternalFrameAdapter;

public class arrayHW {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int [] arr=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        int maxN=Integer.MIN_VALUE;
        int minN=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<minN){
                minN=arr[i];
            }
            if(arr[i]>maxN){
                maxN=arr[i];
            }
    }
    System.out.println(minN);
    System.out.println(maxN);
    for(int i=0;i<arr.length;i++){
        if(arr[i]>arr[i+1]){
            System.out.println(false);
            break;
        }
        else{
            System.out.println("true");
            break;
        }
    }

    }}
