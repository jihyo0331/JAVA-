import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        while (i <= 90) {
            System.out.println("i = "+i);
            sum += i;
            i++;
        }
        System.out.println("1부터 90 까지의 합: "+sum);
    }
}




/*
* ==============변수를 생성할 때 규칙==============
* 변수 이름은 영문자, 숫자, 언더바(_), $로만 구성할 수 있습니다.
* 변수 이름은 숫자로 시작할 수 없습니다.
* 변수 이름 사이에는 공백을 포함할 수 없습니다.
* 예약어는 변수 이름으로 사용할 수 없습니다.
*
* ==============변수의 종류==============
* 기본형 변수
* 기본형 변수는 실제 연산에 사용되는 변수입니다.
*
* 정수형: byte, short, int, long
* 실수형: float, double
* 문자형: char
* 논리형: boolan
*
* 참조형 변수
* 기본형 변수를 사용하여 사용자가 직접 만들어 사용하는 변수 입니다.
*
*
*
* int age = 10;   //10이 리터럴
        final int AGE = 20;  //20이 리터럴
* */
