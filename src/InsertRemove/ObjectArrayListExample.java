package InsertRemove;

import java.util.ArrayList;

/**
 *
 * @author cars0520
 */
public class ObjectArrayListExample {

    public static void main(String[] args) {
        ArrayList<State> states = new ArrayList();

        //manually add 10 states
        states.add(new State("Alabama"));
        states.add(new State("Delaware"));
        states.add(new State("Florida"));
        states.add(new State("Georgia"));
        states.add(new State("Iowa"));
        states.add(new State("Kansas"));
        states.add(new State("Mississippi"));
        states.add(new State("Nebraska"));
        states.add(new State("Texas"));
        states.add(new State("Utah"));

        for (int i = 0; i < 10; i++) {
            System.out.println(states.get(i));
        }

        for (State x : states) {
            System.out.println(x);

            System.out.println("Adding states Arizona and Montana");
            State st = new State("Arizona");
            int loc = findInsertPoint(states, st);
            states.add(loc, st);

            st = new State("Montana");
            loc = findInsertPoint(states, st);
            states.add(loc, st);
            
            
            
            System.out.println("Removing state Georgia");
            st = new State("Georgia");
            loc = states.indexOf("Georgia");
            System.out.println("Georgia is at " + loc);

        }
          
    }
    public static int search(ArrayList a, Object searchValue) {
        int left = 0;
        int right = a.size() - 1;
        while (left <= right) {
            int midpoint = (left + right) / 2;
            int result = ((Comparable) a.get(midpoint)).compareTo(searchValue);
            if (result == 0) {
                return midpoint;
            } else if (result < 0) {
                left = midpoint + 1;
            } else {
                right = midpoint - 1;
            }
        }
        return -1;

    }

    public static int findInsertPoint(ArrayList a, Object searchValue) {
        int left = 0;
        int right = a.size() - 1;
        int midpoint = 0;
        int result = 0;

        while (left <= right) {
            midpoint = (left + right) / 2;
            result = ((Comparable) a.get(midpoint)).compareTo(searchValue);

            if (result < 0) {
                left = midpoint + 1;
            } else {
                right = midpoint - 1;
            }
        }
        if (result < 0) {
            midpoint++;
        }
        return midpoint;

    }
}
