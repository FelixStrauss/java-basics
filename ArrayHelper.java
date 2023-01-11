
public class ArrayHelper{


    public static void main (String[] args) {

        int [] topf = new int [4];
        topf[0] = 1;
        topf[1] = 2;
        topf[2] = 3;
        topf[3] = 4;

        max(topf);
        min(topf);
        sum(topf);
        
    }
        
    public static int max (int[] zahl) {
        
        int maxzahl = -100;

        for(int i = 0; i < zahl.length; i ++) {
        
            if(zahl[i] > maxzahl)
            maxzahl = zahl[i];

        
            }
            System.out.println(maxzahl + "das ist die höchste Zahl!");
            return maxzahl;
    
        }
        public static int min (int[] zahl) {
        
            int minimal = 500;
    
            for(int i = 0; i < zahl.length; i ++) {
            
                if(zahl[i] < minimal)
                minimal = zahl[i];
    
            
                }
                System.out.println(minimal + "das ist die niedrigste Zahl!");
                return minimal;
        
    }

    public static int sum (int[] zahl) {
        
        int sum = 0;
        
        for(int a = 0; a < zahl.length; a ++) {

            sum = sum + zahl[a];


        }


        System.out.println(sum + "das ist die Summe aller Zahlen!");
        return sum;




    }

    
}
