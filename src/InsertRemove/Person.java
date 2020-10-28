package InsertRemove;

import java.util.ArrayList;

/**
 *
 * @author cars0520
 */
public class Person implements Comparable {

    private String name;
    private int age;
    private String gender;

    public Person(String n, int a, String m) {
        name = n;
        age = a;
        gender = m;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
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

    @Override
    public int compareTo(Object o) {
        String other = ((Person) o).getName();
        return name.compareTo(other);
    }

}
