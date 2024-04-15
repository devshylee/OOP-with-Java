package OOP;

public class method_return {
    // return : 실행 중인 메서드를 종료하고 호출한 곳으로 되돌아간ㄷ.
    void printGugudan(int dan){
        if(!(2 <= dan && dan <= 9)){ // dan의 값이 2~9가 아닌 경우, 호출한 곳으로 그냥 되돌아간다.
            return;
        }
        for(int i=1; i<=9; i++){
            System.out.printf("%d * %d&n", dan, i, dan * i);
        }
        return; // 반환 타입이 void이므로 생략 가능. 컴파일러가 자동 추가
    }

    int max(int a, int b){ // 반환타입이 void가 아니므로 생략 불가
        if(a>b){
            return a;
        }
        return b; // 메서드 타입과 일치해야 함
                  // int형으로 자동형변환 가능한 타입은 달라도 가능 ex(char, byte, short)
    }
}