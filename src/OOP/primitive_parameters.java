package OOP;

class Data { int x; }

public class primitive_parameters {
    // 기본형 매개변수 : 변수의 값을 읽기만 할 수 있다.
    // 참조형 매개변수 : 변수의 값을 읽고 변경할 수 있다.
    public static void main(String[] args) {
        Data d = new Data(); // 객체 생성
        d.x = 10;
        System.out.println("main() : x = " + d.x);

        change(d.x);
        System.out.println("After change(d.x)");
        System.out.println("main() : x = " + d.x);
    }
    static void change(int x){ // 기본형 매개변수
        x = 1000; // x에 1000을 할당하지만 지역변수의 특성 상 change메서드의 실행이 종료되면 값이 삭제됨.
        System.out.println("change() : x = " + x);
    }
}

