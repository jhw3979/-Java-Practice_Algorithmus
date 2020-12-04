import prac.*;
import pack.Calculator;
import pack.Students;

public class main {
    public static void main(String[] args) {
        //패키지 사용
        Calculater_extends_PI a = new Calculater_extends_PI();
        a.setValue(1000,50);
        System.out.println(a.PI);
    }
}
