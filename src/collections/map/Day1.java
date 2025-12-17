package collections.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Day1 {
    public static void main(String[] args) {
        HashMap<Object, Object> Student = new HashMap<>();
        Student.put("name","Vishnu");
        Student.put("age",22);
        Student.put("Marital Status",true);
        Student.put("citizen","indian");
        Student.put("Branch","CSE");

        Set<Map.Entry<Object, Object>> entries = Student.entrySet();

        Collection<Object> values = Student.values();
        System.out.println(values);

        for(Map.Entry<Object,Object> entry: entries){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

    }
}
