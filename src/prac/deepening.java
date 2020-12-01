package prac;

class constructor_prac{
    int a, b;

    public void setvalue(int a, int b){
        this.a = a;
        this.b = b;
    }

    public void sum() {
        System.out.printf("%d + %d = %d\n", a, b, a + b);
    }
}

class SubstractionableCalculator extends constructor_prac {
    public void substract() {
        System.out.printf("%d - %d = %d\n", a, b, a - b);
    }
}
public class deepening {
    public static int a = 1000;

    public void class_variable_prac(){
        System.out.println(deepening.a);
    }

    public void class_constructor_prac() {
        constructor_prac a = new constructor_prac();
        a.setvalue(10, 30);
        a.sum();
    }

    public void inheritance(){
        SubstractionableCalculator a = new SubstractionableCalculator();
        a.setvalue(50, 100);
        a.sum();
        a.substract();
    }
}
