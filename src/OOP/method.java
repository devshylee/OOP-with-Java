package OOP;

public class method {
    // 메서드란? 문장들을 묶어놓은 것. 작업 단위로 문장들을 묶어서 이름을 붙인 것
    // 코드중복 제거
    // 코드 관리 용이
    // 제사용성 증가
    // 코드 가독성 증가

    // 메서드 = 선언부 + 구현부
    // 반환타입 메서드이름 (타입 변수명, 타입 변수명, ...) -> 선언부
//    {
//      // 메서두 호출 시 수행될 코드 -> 구현부
//    }

    // 반환타입     메서드이름     매개변수
    static void printArr(int[] numArr){
        for(int i=0; i<10; i++){
            System.out.printf("%d", numArr[i]);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[] numArr = new int[10];
        for(int i=0; i<10; i++){
            numArr[i] = (int)(Math.random()*10);;
        }
        printArr(numArr); // 메서드 호출
    }
}
