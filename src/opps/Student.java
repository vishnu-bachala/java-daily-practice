package opps;

public class Student {
    private int id;
    private String name;
    private int age;

    public Student(){}
    public void setData(int id, String name, int age){
        this.age=age;
        this.id=id;
        this.name=name;
    }
    public int getId(){
        return id;
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
}

