public class ClassAndObject {
    public static void main(String[] args) {
        // 클래스
        // 클래스의 정의 : 클래스란 객체를 정의해 놓은 것
        // 클래스의 용도 : 클래스는 객체를 생성하는데 사용

        // 객체와 인스턴스
        // 객체 : 모든 인스턴스를 대표하는 일반적 용어
        // 인스턴스 : 특정 클래스로부터 생성된 객체(예: TV인스턴스)
        // 클래스 -> 인스턴스(객체) = 인스턴스화

        // 클래스와 객체
        // 클래스가 필요한 이유 : 객체를 생성하기 위해
        // 객체가 필요한 이유 : 객체를 사용하기 위해
        // 객체를 사용한다는 것은? : 객체가 가진 속성과 기능을 사용하기 위해
    }
}
class Tv{
    // 객체 = 속성(변수) + 기능(메서드)
    // 속성 : 크기, 길이, 높이, 색상, 불륨, 채널 등
    // 기능 : 켜기, 끄기, 불륨 높이기, 불륨 낮추기, 채널 변경하기 등

    String color; // 색깔
    boolean power; // 전원상태
    int channel; // 채널

    void power(){ power = !power; }
    void channelUp(){ channel++; }
    void channelDown(){ channel--; }

}
