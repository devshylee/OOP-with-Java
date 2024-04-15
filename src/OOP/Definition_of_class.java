package OOP;

public class Definition_of_class {
    // 클래스란
    // 1. 설계도
    // 2. 데이터 + 함수
    // 3. 사용자 정의 타입

    // 변수 -> 배열 -> 구조체 -> 클래스
    // 변수 : 하나의 데이터를 저장할 수 있는 공간
    // 배열 : 같은 종류의 여러 데이터를 하나로 저장할 수 있는 공간
    // 구조체 : 서로 관련된 여러 데이터(종류 관계X)를 하나로 저장할 수 있는 공간
    // 클래스 : 데이터와 함수의 결합(구조체+함수)

    // 사용자 정의 타입 : 원하는 타입을 직접 만들 수 있다.
    int hour;
    int minute;
    int second;

    int hour1, hour2, hour3;
    int minute1, minute2, minite3;
    int second1, second2, second3;

    int[] hourr = new int[3];
    int[] minutee = new int[3];
    int[] secondd = new int[3];

    public static void main(String[] args) {
        Time t = new Time();
        t.hour = 12;
        t.minute = 34;
        t. second = 56;
        System.out.println(t.hour+"시"+t.minute+"분"+t.second+"초");

        // 서로 관련된 값들을 묶을 수 있고 코드 복잡도 개선, 유지보수 용이
    }
}
class Time {
    int hour;
    int minute;
    int second;
}