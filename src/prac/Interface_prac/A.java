package prac.Interface_prac;

public class A{

    private X x;

    public void setX(X x) {
        this.x = x;
    }

    public int add(int a, int b) {
        return a+b;
    }

    public int subtract(int a, int b) {
        return a-b;
    }

    public void print() {
       int total = x.total();

       System.out.println(total);
    }
}
