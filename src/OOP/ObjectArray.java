package OOP;

public class ObjectArray {
    public static void main(String[] args) {
        // 객체 배열 == 참조변수 배열
        //OOP.Tv tv1, tv2, tv3;
        Tv[] tvArr = new Tv[3];
        tvArr[0] = new Tv();
        tvArr[1] = new Tv();
        tvArr[2] = new Tv();

    }
    // 주의 객체 배열을 선언을 한다고 생성이 되는 것이 아니므로
    // 선언 후 반드시 생성명령까지 해야 함.
}
