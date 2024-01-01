import java.util.*;
public class string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // int size=sc.nextInt();
        // int totol=0;
        // String [] arr=new String[size];
        // for(int i=0;i<size;i++){
        //     arr[i]=sc.next();
        //     totol+=arr[i].length();
        // }
        // System.out.println(totol);

        String str=sc.next();
        String result="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='@'){
                break;
            }
            else{
                result+=str.charAt(i);
            }
        }
        System.out.println(result);


    }
}
