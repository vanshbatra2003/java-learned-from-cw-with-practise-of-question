import java.util.Map;
import java.util.*;

public class video64_Question {
    public static void main(String[] args) {
        int [] arr={1,4,2,5,5,1,4,4,6,4,4,4};
        Map <Integer,Integer> freq = new HashMap <> ();
        for(int el:arr){
            if(!freq.containsKey(el)){
                freq.put(el, 1);
            }
            else{
                freq.put(el, freq.get(el)+1);
            }
        }
        System.out.println("frequency Map : ");
        System.out.println(freq.entrySet());
        int mxfreq=0,anskey=-1;
        // for(var e : freq.entrySet()){
        //     if(e.getValue()>mxfreq){
        //         mxfreq=e.getValue();
        //         anskey=e.getKey();
        //     }
        // }

        for(var key : freq.keySet()){
            if(freq.get(key)>mxfreq){
                mxfreq=freq.get(key);
                anskey=key;
            }
        }
        System.out.printf("%d has max frequency and it occurs %d times",anskey,mxfreq);
    }
}