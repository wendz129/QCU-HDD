
import java.util.ArrayList;
import java.util.List;

public class BooleanKeywordExample {

    public static void main(String [] args) {

        boolean isEmpty = false;
        final List < Integer > integers = new ArrayList < > ();
        if (integers.size() == 0) {
            isEmpty = true;
        }

        System.out.println("IS List empty :: " + isEmpty);

    }

    private boolean initialized = false;

    public void synchronizeConnection() {
        if (!initialized) {
            // some code here
            initialized = true;
        }
    } 
    
}
