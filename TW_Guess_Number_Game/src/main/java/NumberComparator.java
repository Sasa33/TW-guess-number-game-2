import java.util.ArrayList;
import java.util.List;

public class NumberComparator {
    public String compare(String randomNumber, String inputNumber) {
//        if (randomNumber.equals(inputNumber))
//            return "4A0B";
//        else
//            return "2A2B";

        int numA = 0;
        int numB = 0;
        for(int i=0; i<randomNumber.length(); i++) {
            if(randomNumber.charAt(i) == inputNumber.charAt(i)) {
                numA++;
            } else if(randomNumber.indexOf(inputNumber.charAt(i)) != -1){
                numB++;
            }
        }

        return numA+"A"+numB+"B";
    }
}
