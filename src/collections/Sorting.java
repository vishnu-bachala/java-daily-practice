package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Sorting {
    public static void main(String [] args){

        List<String> names= new ArrayList<>();
        names.add("vishnu");
        names.add("hema");
        names.add("manoj");
        names.add("murali");
        names.add("balu");

        //Inserted oder
        System.out.println("Insertion order "+names);
        // Sorting based on a-z
        Collections.sort(names);
        System.out.println("Sorted order : "+names);
        // Reverse order
        Collections.sort(names, Collections.reverseOrder() );
        System.out.println("Reversed order :"+names);
    }
}
