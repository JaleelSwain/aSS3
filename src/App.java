import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        

        Integer[] isbnNumbers = {141439571, 61120081, 1400033411, 553212478};
        int numberToFind = 1400033411;
        int numberToFind2 = 764797797;
        boolean found = isNumberInArray(isbnNumbers, numberToFind);
        boolean found2 = isNumberInArray(isbnNumbers, numberToFind2);
        
        if (found) {
            System.out.println(numberToFind + " is found.");
        } else {
            System.out.println(numberToFind + " is not found.");
        }

if (found2) {
            System.out.println(numberToFind2 + " is found.");
        } else {
            System.out.println(numberToFind2 + " is not found.");
        }
    }
    
    public static boolean isNumberInArray(Integer[] array, int number){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return true; 
            }
        }
        return false;
    }

}
