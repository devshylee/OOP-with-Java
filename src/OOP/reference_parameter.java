package OOP;

class Data2 { int x; }
public class reference_parameter {

    // 호출스택을 생각하며 진행할 것
    public static void main(String[] args) {
        Data2 d = new Data2(); // 객체 생성
        d.x = 10;
        System.out.println("main() : x = " + d.x);

        change(d);
        System.out.println("After change(d)");
        System.out.println("main() : x = " + d.x);
    }
    static void change(Data2 d){ // 참조형 매개변수
        d.x = 1000; //
        System.out.println("change() : x = " + d.x);
    }
}
