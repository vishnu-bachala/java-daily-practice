package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee{
    int eId;
    String name;
    int salary;

    public Employee(int eId,String name,int salary) {
        this.eId = eId;
        this.name = name;
        this.salary= salary;
    }

    @Override
    public String toString() {
        return  eId + " " + name + "  "+  salary ;
    }
}

// sorting done by ids
class IdComparator implements Comparator<Employee>{
    public int compare(Employee e1, Employee e2){
        return e1.eId-e2.eId;
    }
}

//Sorting done by names
class NameComparator implements Comparator<Employee>{
    public int compare(Employee e1, Employee e2){
        return e1.name.compareTo(e2.name);
    }
}

public class SortByComparator {
    public static void main(String [] args){
        ArrayList<Employee> emp= new ArrayList<>();

        emp.add(new Employee(101,"guna",20000));
        emp.add(new Employee(105,"vishnu",40000));
        emp.add(new Employee(108,"naveen",70000));
        emp.add(new Employee(109,"narendra",80000));
        emp.add(new Employee(100,"kamal",15000));

        System.out.println("<==== Sorting by ids =====>");
        emp.sort(new IdComparator());
        for(Employee e : emp) {
            System.out.println(e);
        }

        System.out.println("<==== sorting by names ====>");
        emp.sort(new NameComparator());
        for(Employee e : emp) {
            System.out.println(e);
        }
    }
 }
