import java.util.*;
public class video25 {
    static void parcaltriangle(int n){
        int ans [][] =new int [n][];
        for(int i =0;i<n;i++){
            // ith row for i+1 column
            ans[i]=new int [i+1];
            // 1st and last element of every column is 1
            ans[i][0]=ans[i][i]=1;
            // other
            for(int j=1;j<i;j++){
                ans[i][j]=ans[i-1][j]+ans[i-1][j-1];
            } 
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void rotate2darray(int arr[][],int n,int m){
        transpose(arr, n, n);
        int i=0,j=n-1;
        while(i<j){
            for (int k = 0; k < n; k++) {
                int temp = arr[k][i];
                arr[k][i] = arr[k][j];
                arr[k][j] = temp;
            }
            i++;
            j--;
        }
        for(int a=0;a<n;a++){
            for(int b=0;b<n;b++){
                System.out.print(arr[a][b]+" ");
            }
            System.out.println();
        }
    }
    static void transpose(int arr[][],int n,int m){
        int arr2 [][]=new int [m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr2[i][j]=arr[j][i];
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void transposeusingswapfunction(int arr[][],int n,int m){
        for(int i=0;i<m;i++){
            for(int j=i;j<n;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        
        // ye lines upper wale 2 k lia chalegi 
        // parcal k lia bss n ki value chahie baki sara kam function kr lega


        // int n=sc.nextInt();
        // int m=sc.nextInt();
        // int arr[][]=new int [n][m];
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<m;j++){
        //         arr[i][j]=sc.nextInt();
        //     }
        // }
        // rotate2darray(arr, n,m);

        int n=sc.nextInt();
        parcaltriangle(n);
    }
}



// but jo ye transposeusingswapfunction wala transpose h woh sirf tab chalega tab row and column ki value equal hogi ye jyada kam ka ni h