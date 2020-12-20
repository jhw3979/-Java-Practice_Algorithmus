package prac;
abstract class Info{
    public abstract int getLevel();
}
class StudentInfo extends Info{
    public int rank;

    StudentInfo(int rank){ this.rank = rank; }
    public int getLevel(){
        return this.rank;
    }
}
class EmployeeInfo extends Info{
    public int rank;

    EmployeeInfo(int rank){ this.rank = rank; }
    public int getLevel(){
        return this.rank;
    }
}
class Person<T extends Info, S> {
    public T info;
    public S id;

    Person(T info, S id) {
        this.info = info;
        this.id = id;
    }

    public <U> void printInfo(U info) {
        System.out.println(info);
    }
}

public class GenericDemo{
    public void run() {
        EmployeeInfo e = new EmployeeInfo(1);
        Integer i = new Integer(10);
        Person p1 = new Person(e, i);
        p1.printInfo(e);
    }
}