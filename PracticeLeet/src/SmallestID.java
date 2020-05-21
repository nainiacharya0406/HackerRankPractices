import java.util.HashSet;
public class SmallestID{
    public static void main(String[] args) {
        Long[] in = {(long) 8967, (long) 9485};
        System.out.println(FN(in)); 
    }
    public static int FN(Long[] ins){
        
        boolean a = false;
        int n = 2;
        while(!a){
            HashSet<Long> um = new HashSet<>();
            for(int i=0;i<ins.length; i++){
            	Long ni = ins[i]%n; 
            	if(um.contains(ni)){ 
                    break;
                }else{
                    um.add(ni);
                    if(i == ins.length-1){ 
                        a = true;
                    }
                }
            }
            if(!a){
                n++;
            }
        }
        return n;
    }
}