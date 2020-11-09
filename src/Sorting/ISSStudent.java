
package Sorting;

/**
 *
 * @author cars0520
 */
public class ISSStudent implements Comparable{
    private String name, address;
    private int id;
    
    ISSStudent(String n, String a, int i){
        name = n;
        address = a;
        id = i;
    }
    
    public String toString(){
        return "Name:\t\t" + name + "\nAddress:\t" + address +
                "\nID:\t\t" + id;
    }
    
    public int getID(){
        return id;
    }
    
        @Override
    public int compareTo(Object t) {
        if (this.id > ((ISSStudent)t).getID())
            return 1;
        else if(this.id < ((ISSStudent)t).getID())
            return -1;
        else 
            return 0;
    }    
    public String getName(){
        return name;
    }

}
