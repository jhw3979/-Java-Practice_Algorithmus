package prac;

public class repeat {
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
