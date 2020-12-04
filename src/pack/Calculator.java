package pack;

public class Calculator {
    //계산기 기능 덧셈, 뺄셈, 나눗셈, 곱셈
    private int left, right;

    public Calculator(){}

    public Calculator(int left, int right){
        this.left = left;
        this.right = right;
    }

    private int _sum(){ return this.left+this.right; }
    private int _subtract(){ return this.left-this.right; }
    private int _divide() { return this.left/this.right; }
    private int _multiplication(){ return this.left*this.right; }
    public void sum(){
        System.out.println(this.left + " + " + this.right + " = " + _sum());
    }
    public void subtract(){
        System.out.println(this.left + " - " + this.right + " = " + _subtract());
    }
    public void divide(){
        System.out.println(this.left + " / " + this.right + " = " + _divide());
    }
    public void multiplication(){
        System.out.println(this.left + " * " + this.right + " = " + _multiplication());
    }
}

