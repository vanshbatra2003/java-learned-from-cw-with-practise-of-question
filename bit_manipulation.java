import java.util.Scanner;

public class bit_manipulation {
    // public static void main(String[] args) {
    //     int n=5;
    //     int pos=1;
    //     // int get=1;
    //     // int bitmask=get<<pos;
    //     int bitmask=n<<pos;
        
    //     // if((bitmask & n)==0){
    //     //     System.out.println("zero");
    //     // }
    //     // else{
    //     //     System.out.println("one");
    //     // }

    //     int newNumber=bitmask|n;
    //     System.out.println(newNumber);
    // }

    public static void main(String[] args) {
        // clear
        int n=5;
        int pos=2;
        int bitmask=n<<pos;
        int notBitMask=~(bitmask);
        int newNumber=(notBitMask & n);
        System.out.println(newNumber);

        // update 
        // 0 banane k lia clear use krte h aur 1 banana k lia set bit use krte h 
    }

    // public static void main(String[] args) {
    //     // update 
    //     int n=5;
    //     Scanner sc=new Scanner(System.in);
    //     int oper=sc.nextInt();
    //     int pos=2;
    //     int bitmask=n<<pos;
    //     if(oper==1){
    //         // set
    //         int newNumber=bitmask | n;
    //         System.out.println(newNumber);
    //     }
    //     else{
    //         // clear
    //         int newBitmask=~(bitmask);
    //         int newNumber=(newBitmask & n);
    //         System.out.println(newNumber);
    //     }
    // }
}
