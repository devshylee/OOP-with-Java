package OOP;

public class class_and_instance_variable {
    // 개별적인 속성은 인스턴스 변수
    // 공통적인 속성은 클래스 변수

    // 카드 예제

    public static void main(String[] args) {
        System.out.println("OOP.Card.width = " + Card.width);
        System.out.println("OOP.Card.height = " + Card.height);

        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;

        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 4;

        System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.height + ", " + c1.width + ")");
        System.out.println("c2은 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.height + ", " + c2.width + ")");
        c1.width = 50; // 클래스 변수는 클래스명.변수 로 할당하는것을 권장
        c1.height = 80;
    }
}
class Card{
    String kind; // 무늬
    int number; // 숫자
    static int width = 100; // 폭
    static int height = 250; // 높이
}
