package prac;
import prac.Cal;

public class Calculater implements Cal{
    int left, right;

    public void setValue(int left, int right){
        this.left = left;
        this.right = right;
    }
    private int _sum(){ return this.left+this.right; }
    private int _subtract(){ return this.left-this.right; }
    private int _divide() {
        return this.left / this.right;
    }
    private int _multiplication(){
        return this.left*this.right;
    }

    public void sum(){
        System.out.printf("%d + %d = %d\n", this.left, this.right, _sum());
    }
    public void subtract(){
        System.out.printf("%d - %d = %d\n", this.left, this.right, _subtract());
    }
    public void divide(){
        if (right == 0){
            //throw new IllegalArgumentException("두번째 인자의 값은 0이 될 수 없습니다.");
            System.out.println("두번째 인자의 값은 0이 될 수 없습니다.");
        } else {
            System.out.printf("%d / %d = %d\n", this.left, this.right, _divide());
        }
    }
    public void multiplication(){
        if (right == 0){
            //throw new IllegalArgumentException("두번째 인자의 값은 0이 될 수 없습니다.");
            System.out.println("두번째 인자의 값은 0이 될 수 없습니다.");
        } else {
            System.out.printf("%d * %d = %d\n", this.left, this.right, _multiplication());
        }
    }

    public void run(){
        this.sum();
        this.subtract();
        this.divide();
        this.multiplication();
    }
}