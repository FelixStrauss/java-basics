import java.util.ArrayList;
import java.util.Collections;

public class LottoGen {

    public static void main (String[] args) {
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        for (int i= 1; i<49; i++) {

            myNumbers.add(i);
        }
        System.out.println("These are your number?");
        mix(myNumbers);
        System.out.println("You have won the lotterie! Congratulations!");

    }
    public static ArrayList<Integer> mix(ArrayList<Integer> zahl) {
        
        Collections.shuffle(zahl);
        ArrayList<Integer> chest = new ArrayList<Integer>();
        for (int i= 0; i<6; i++){

            chest.add(i);

        System.out.println(zahl.get(i));
        
        }
    
    return zahl;    }

    


}
