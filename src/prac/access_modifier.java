package prac;

class A {
    public String y(){
        return "public void y()";
    }
    private String z(){
        return "public void z()";
    }
    public String x(){
        return z();
    }
}


class B {

}
public class access_modifier {
    public void access_modifier_prac(){
        A a = new A();
        System.out.println(a.y());
        System.out.println(a.x());
    }
}
