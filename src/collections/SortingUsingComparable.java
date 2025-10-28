package collections;

import java.util.*;

class Student implements Comparable<Student>{
    int id;
    String name;
    int age;
    long mobile;

    public Student (int id, String name, int age, long mobile) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.mobile =mobile;
    }
    public int compareTo(Student st){
        /* ascending order of ids *
//        if(this.id == st.id)
//                return 0;
//        else if (this.id > st.id)
//            return 1;
//        else
//            return -1;
//
        /* reverse order */
        if(this.id == st.id) return 0;
        else if (this.id < st.id) return 1;
        else return -1;
    }

    @Override
    public String toString (){
        return this.id+" "+this.name+" "+this.age+" "+this.mobile;
    }
}
public class SortingUsingComparable {
    public static void main(String [] args){
        List<Student> s = new LinkedList<>() ;
        s.add(new Student(1001,"Dhoni",24,942344656));
        s.add(new Student(1006,"Vishnu",23,962344656));
        s.add(new Student(1005,"amanta",19,972344656));
        s.add(new Student(1004,"Sai kumar",21,912344656));

        Collections.sort(s);
        for (Student student : s) {
            System.out.println(student);
        }
    }

}
