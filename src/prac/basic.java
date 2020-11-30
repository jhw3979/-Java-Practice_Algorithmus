package prac;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class basic {
    public void arr(){
        System.out.println("배열 연습");
        int[] arr = new int[100];
        for (int i=0; i<100;i++){
            System.out.print(i+",");
            arr[i] = i;
            if(i == 99){
                System.out.println("");
            }
        }
        for (int a : arr){
            System.out.print(a+",");
        }
    }
    public void if_prac() {
        if (true){
            System.out.println("성공");
        }
        else {
            System.out.println("실패");
        }
    }
    public void Conditional_Operator(){
        System.out.println("Conditional Operator연습");
        System.out.println("And연산자");
        System.out.println("true && true = " + (true && true));
        System.out.println("true && false = " + (true && false));
        System.out.println("false && false = " + (false && false));
        System.out.println("true || true = " + (true||true));
        System.out.println("true || false = " + (true||false));
        System.out.println("false || false = " + (false||false));
        System.out.println("!true = "+(!true));
        System.out.println("!false = "+(!false));
    }
    public void in_out_prac1(String[] args) {
        System.out.println("입출력");
        for (String a : args) {
            System.out.println(a);
        }
    }
    public void in_out_prac2(){
        System.out.println("Scanner사용하기");
        Scanner sc = new Scanner(System.in);
        System.out.print("입력값을 적어주세용 :");
        int i = sc.nextInt();
        System.out.println(i*1000);
        sc.close();
    }
    public void in_out_prac3(){
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자만입력해 : ");
        while(sc.hasNextInt()) {
            System.out.println(sc.nextInt());
        }
    }
    public void in_out_prac4(){
        System.out.println("파일 Scanner");
        try {
            File file = new File("out.txt");
            Scanner sc = new Scanner(file);
            //System.out.println(sc.nextInt());
            System.out.println(sc.nextLine());
            sc.close();
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
    public void method_a(){
        System.out.println("method_a입니다.(define)");
    }

    public void method_b(){
        System.out.println("method_b입니다.");
        System.out.println("method_b에서 method_a를 불러보겠습니다.(call)");
        method_a();
    }
    public void repeat_prac(){
        System.out.println("while문 연습");
        int a = 0;
        while (true){
            if (a == 100) {
                System.out.print("\n");
                break;
            } else {
                System.out.print((char)a);
                a++;
            }
        }
        for (int i = 0; i<50; i++){
            System.out.print(i+",");
        }
    }
}
