import prac.basic;
import prac.deepening;
import pack.Calculator;
import pack.Students;

public class main {
    public static void main(String[] args) {
        //패키지 사용
        deepening a = new deepening();
        a.class_variable_prac();
        a.a = 0;
        a.class_variable_prac();
        deepening b = new deepening();
        b.class_variable_prac();
    }
}
