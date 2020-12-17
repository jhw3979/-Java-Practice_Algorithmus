package prac;

class Fruit {
    public int count;
    public static final Fruit APPLE = new Fruit(5);
    public static final Fruit PEACH = new Fruit(5);
    public static final Fruit BANANA = new Fruit(5);

    public Fruit(){}
    public Fruit(int count){
        this.count = count;
    }
}
class Company {
    public static final Company GOOGLE = new Company();
    public static final Company APPLE = new Company();
    public static final Company ORACLE = new Company();

}
public class constantDemo {
    public void compare(){
        System.out.println(Fruit.APPLE.count);
    }
}
