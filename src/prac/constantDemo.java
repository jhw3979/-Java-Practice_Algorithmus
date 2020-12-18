package prac;

class Fruit {
    private int count;
    private int price;
    public static final Fruit APPLE = new Fruit(5, 5000);
    public static final Fruit PEACH = new Fruit(5, 10000);
    public static final Fruit BANANA = new Fruit(5, 1000);

    public Fruit(){}
    public Fruit(int count){
        this.count = count;
    }
    public Fruit(int count, int price){
        this.count = count;
        this.price = price;
    }
    public int getcount(){
        return this.count;
    }
    public int getprice(){
        return this.price;
    }
}
class Company {
    public static final Company GOOGLE = new Company();
    public static final Company APPLE = new Company();
    public static final Company ORACLE = new Company();

}
public class constantDemo {
    public void compare(){
        System.out.println(Fruit.APPLE.getprice());
    }
}
