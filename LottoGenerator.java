

public class LottoGenerator {
    

    public static void main (String[] args) {

        int[] pool = {0,0,0,0,0,0};

        gen(pool);
    }
    public static int[] gen (int[] zahl) {
        
        for (int i= 0; i<zahl.length; i++) {

        zahl[i] = (int)(Math.random() * 49)+1;  // 0 to 49
        
            System.out.println(zahl[i]);
        }
        
        return zahl;
    } 
    
}
