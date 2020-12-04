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
    private int _divide() { return this.left/this.right; }
    private int _multiplication(){ return this.left*this.right; }
    public void sum(){
        System.out.printf("%d + %d = %d\n", this.left, this.right, this.left+this.right);
    }
    public void subtract(){
        System.out.printf("%d - %d = %d\n", this.left, this.right, this.left-this.right);
    }
    public void divide(){
        System.out.printf("%d / %d = %d\n", this.left, this.right, this.left/this.right);
    }
    public void multiplication(){
        System.out.printf("%d * %d = %d\n", this.left, this.right, this.left*this.right);
    }

    public void run(){
        this.sum();
        this.subtract();
        this.divide();
        this.multiplication();
    }
}