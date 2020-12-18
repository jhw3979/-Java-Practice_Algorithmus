package prac;

enum Fruit_e{
    APPLE("red",5000),
    BANANA("yello", 500),
    PEACH("pink",3000);

    private String color;
    private int price;

    Fruit_e(){}
    Fruit_e(String color){
        System.out.println("Call constructor "+this);
        this.color = color;
    }
    Fruit_e(String color, int price){
        System.out.println("Call constructor "+this);
        this.color = color;
        this.price = price;
    }
    public String getColor(){
        return this.color;
    }
    public int getPrice(){
        return this.price;
    }
}
enum Company_e{
    APPLE, BANANA, PEACH;
}
public class enumDemo {
    public void compare(){
        //System.out.println(Fruit_e.APPLE == Company_e.APPLE);
        System.out.println(Fruit_e.APPLE.getColor());

        for (Fruit_e f : Fruit_e.values()){
            System.out.println(f+", "+f.getColor()+", "+ f.getPrice());
        }
    }
}
