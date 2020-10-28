package Searching;

/**
 *
 * @author cars0520
 */
public class State implements Comparable {

    private String name;
    private int population;

    public State(String n) {
        name = n;
        population = (int) (Math.random() * 8000000) + 1000000;
    }

    public String toString() {
        return String.format("%15s --> Population: %d",name,population);
    }

    public int getPopulation() {
        return population;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Object t) {
        State other = (State) t;//casting t to be a state object
        return name.compareTo(other.getName());
    }
}
