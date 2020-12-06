import prac.*;

public class main {
    public static void main(String[] args) {
        //패키지 사용
        Calculater a = new Calculater();
        a.setValue(100,0);
        a.sum();
        a.subtract();
        a.divide();
        a.multiplication();
    }
}
