package prac;
import prac.Calculater;
import java.io.*;

class _B{
    void run() throws IOException{
        BufferedReader bReader = null;
        String input = null;
        bReader = new BufferedReader(new FileReader("out.txt"));
        input = bReader.readLine();
        System.out.println(input);
    }
}

class C{
    void run(){
        _B b = new _B();
        try {
            b.run();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("out.txt파일이 필요합니다.");
        }
    }
}

class E{
    void throwArithmeticException(){
        throw new ArithmeticException();
    }
    void throwIOException1(){
        try {
            throw new IOException();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    void throwIOException2() throws IOException{
        throw new IOException();
    }
}

public class exception_control{
    public void excp01(){
        Calculater a = new Calculater();
        try {
            a.setValue(100, 0);
            a.divide();
        } catch (ArithmeticException e) {
            System.out.println("error : " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("error : " + e.getMessage());
        } finally {
            System.out.println("finally");
        }
        System.out.println("end");
    }
    public void excp02(){
        BufferedReader bReader = null;
        String input =null;
        try {
            bReader = new BufferedReader(new FileReader("out.txt"));
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
        try {
            input = bReader.readLine();
        } catch (IOException e){
            e.printStackTrace();
        }
        System.out.println(input);
    }
    public void excp03(){
        C a = new C();
        a.run();
    }
    public void excp04(){

    }
}
