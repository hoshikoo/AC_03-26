package nyc.c4q.hoshikoo;

/**
 * Created by Hoshiko on 3/27/15.
 */

import java.util.ArrayList;
import java.util.Iterator;
public class IterateOverArrayList {

    public static void main(String[] args) {
        ArrayList<String> positions = new ArrayList();

        positions.add("First");
        positions.add("Second");
        positions.add("Third");
        Iterator<String> iterate = positions.iterator();
        while (iterate.hasNext()) {
            System.out.println(iterate.next());
        }

    }
}