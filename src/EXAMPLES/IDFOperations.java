package EXAMPLES;
import java.util.*;
public class IDFOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            int op=sc.nextInt();
            int x=sc.nextInt();
            if(op==1){
                map.put(x,map.getOrDefault(x, 0)+1);
            }else if(op==2){
                if(map.containsKey(x)){
                    if(map.get(x)>1){
                        map.put(x, map.get(x)-1);
                    }else{
                        map.remove(x);
                    }
                }
            }else if(op==3){
                System.out.println(map.containsKey(x)?"Found":"Not Found");
            }
        }
    }
}