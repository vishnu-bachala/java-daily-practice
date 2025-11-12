package opps;

public class Main {
    public static void  main(String [] args){
        Student s1= new Student();
        s1.setData(101, "vishnu", 23);
        System.out.println(s1.getId()+" : "+ s1.getName()+ " : "+s1.getAge());
    }
}
