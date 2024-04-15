package OOP;

public class create_and_use_objects {
    // 클래스명 변수명;
    // 변수명 = new 클래스명();

    // 클래스명 변수명 = new 클래스명();
    public static void main(String[] args) {
        // OOP.Tv t;   // Tv클래스 타입의 참조변수 t를 선언
        // t = new OOP.Tv();    // Tv인스턴스를 생성한 후, 생성된 Tv인스턴스의 주소를 t에 저장
        Tv t = new Tv();
        t.channel = 7;
        t.channelDown();

        System.out.println("t의 channel값은 " + t.channel + "입니다.");
    }
}

