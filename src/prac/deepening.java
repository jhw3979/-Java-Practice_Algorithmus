package prac;
import pack.Calculator;

class constructor_prac{
    int a, b;
    int c = 0;
    static final double PI = 3.14;

    public constructor_prac(){}

    public constructor_prac(int a, int b){
        this.a = a;
        this.b = b;
    }

    public constructor_prac(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setvalue(int a, int b){
        this.a = a;
        this.b = b;
    }
    public void sum() {
        System.out.printf("%d + %d + %d = %d\n", a, b, c, a + b + c);
    }
}

//상속
class Subtraction_Calculator extends constructor_prac {
    public Subtraction_Calculator(int a, int b){
        this.a = a;
        this.b = b;
    }

    public void substract() {
        System.out.printf("%d - %d = %d\n", a, b, a - b);
    }
}

//super 생성자, 상속
class Division_super_Calculator extends constructor_prac {
    //super 사용하여 부모클래스 생성자 사용하기
    public Division_super_Calculator(int a, int b){
        //super는 부모클래스를 의미한다. this와 비슷함
        //부모클래스의 생성자
        super(a, b);
        //super생성자로 객체 초기화 후 객체 변수 수정해야됨!!!!!!!!!!!!!
//        this.a = 500;
//        this.b = 500;
    }

    public void division() {
        System.out.printf("%d / %d = %d\n", a, b, a/b);
    }
}

//overriding 재정의
class sum_overriding_Calculator extends constructor_prac{
    public sum_overriding_Calculator(int a, int b){
        super(a, b);
    }

    public void sum() {
        System.out.println("오버라이딩된 sum()메소드입니다.");
        System.out.printf("%d + %d = %d\n", a, b, a + b);
    }
}

//overriding 리턴타입
class Division_overriding_Calculator extends Division_super_Calculator{
    public Division_overriding_Calculator(int a, int b){
        super(a, b);
    }

    public void division() {
        System.out.println("Division_super_Calculator 상속");
        System.out.println("division() 메소드 overriding");
        //코드 중복 삭제할 수 있다.
        //super를 사용하여 부모객체를 참조 할 수 있다.
        super.division();
    }
}


public class deepening {
    //클래스 변수
    public static int a = 1000;

    //클래스 변수 출력
    public void class_variable_prac(){
        System.out.println(deepening.a);
    }

    //생성자
    public void class_constructor_prac() {
        constructor_prac a = new constructor_prac();
        a.setvalue(10, 30);
        a.sum();
    }

    //상속
    public void inheritance_prac(){
        Subtraction_Calculator a = new Subtraction_Calculator(50, 100);
        a.sum();
        a.substract();
    }

    //생성사 없는 객체 생성
    public void inheritance_constructor_prac(){
        constructor_prac a = new constructor_prac();
        a.setvalue(10,20);
        System.out.println("생성자 없는 객체 생성: ");
        a.sum();
        constructor_prac b = new constructor_prac(10,20); //생성자 있는 객체 생성
        System.out.println("생성자 있는 객체 생성: ");
        b.sum();
    }
    //super 생성자
    public void super_prac(){
        Division_super_Calculator a =  new Division_super_Calculator(100, 50);
        a. division();
    }

    //overriding 재정의
    public void overriding_prac(){
        //오버라이딩은 부모의 변수,메소드를 수정하여 사용할 수 있다.
        sum_overriding_Calculator a = new sum_overriding_Calculator(50, 100);
        a.sum();
    }

    //overriding중 서명 일치 필수
    public void overriding_return_type_prac(){
        //오버라이딩을 할 때 서명(메소드 이름, 메소드 매개변수 (개수, 타입, 순서), 리턴타입)이 일치하지 않으면 오류가 발생한다!!!!!
        Division_overriding_Calculator a = new Division_overriding_Calculator(4000, 2000);
        a.division();
    }

    //overloading 사용 예제
    public void overloading_constructor_prac(){
        constructor_prac a = new constructor_prac(10, 20, 30);
        constructor_prac b = new constructor_prac(10, 20);
        a.sum();
        b.sum();
    }
}
