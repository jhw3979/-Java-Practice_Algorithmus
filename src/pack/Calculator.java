package pack;

public class Calculator {
    //계산기 기능 덧셈, 뺄셈, 나눗셈, 곱셈
    int left, right;

    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }
    public void sum(){
        System.out.println(this.left + " + " + this.right + " = " + (this.left+this.right));
    }
    public void subtract(){
        System.out.println(this.left + " - " + this.right + " = " + (this.left-this.right));
    }
    public void divide(){
        System.out.println(this.left + " / " + this.right + " = " + (this.left/this.right));
    }
    public void multiplication(){
        System.out.println(this.left + " * " + this.right + " = " + (this.left*this.right));
    }
}

