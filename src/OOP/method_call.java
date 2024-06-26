package OOP;

public class method_call {
    public static void main(String[] args) {
        MyMath mm = new MyMath();
        long result1 = mm.add(5L, 3L);
        long result2 = mm.subtract(5L, 3L);
        long result3 = mm.multiply(5L, 3L);
        long result4 = mm.divide(5L, 3L);

        System.out.println("add(5L, 3L) = " + result1);
        System.out.println("subtract(5L, 3L) = " + result2);
        System.out.println("multiply(5L, 3L) = " + result3);
        System.out.println("divide(5L, 3L) = " + result4);
    }
}
class MyMath{ // 메서드는 클래스 영역에만 정의 가능
    long add(long a, long b){
        return a + b; // 작업을 마치면 호출한 곳으로 돌아간다
    }
    long subtract(long a, long b){
        return a - b;
    }
    long multiply(long a, long b){
        return a * b;
    }
    long divide(double a, double b){
        return (long) (a / b);
    }
}
