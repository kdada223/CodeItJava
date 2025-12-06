public class Operators {
  public static void main(String[] args) {
    int a = 9;
    // int b = 5;
    float b = 5;
    System.out.println(a + " + " + b + " = " + (a + b));
    System.out.println(a + " - " + b + " = " + (a - b));
    System.out.println(a + " * " + b + " = " + (a * b));
    System.out.println(a + " / " + b + " = " + (a / b));
    System.out.println(a + " % " + b + " = " + (a % b));

    // long x = 20;
    // int y = x;
    // 이렇게 작성하면 정보를 잃을 위험 때문에 java에서 막음
    //int x = 20;
    //long y = x;
    //이런건 가능함
    //만약에 double의 값을 int로 억지로 바꾸고 싶다면? 형변환을 하면 됨
    // double x = 3.14;
    // int y = (int) x;
    // System.out.println(y);
    //이렇게 하면 가능 

    // int x = 9;
    // int y = 5;
    // System.out.println(x / y);
    //만약에 이 코드에서 결과값이 소수점까지 표현되기를 원한다면? 타입캐스팅이라고 부르는데
    //다만 큰 랭크의 값을 더 작은 랭크의 변수에 담는 것도 가능하지만 데이터 손실은 주의해야함
    //형변환 표 궁금하면 찾아보는거 추천
    int x = 9;
    int y = 5;
    System.out.println((double) x / y);
    //이렇게 작성
  }
  //연산자 중 하나라도 소수형이 있으면 결과값도 소수로 나옴
  //그 소리는 숫자형 연산자들 사이에 순위?가 있다는 말
  //순위는 byte < short < int < long < float < double 순으로 강함
  //무슨 기준이냐? 얼마나 넓은 범위의 값들을 가질 수 있냐 즉 byte 크기의 차이

  public static int sub(int a) {
    //리터럴이란 소스코드의 고정된 값을 대표하는 용어이다.
    int myInt = 123;
    byte myByte = 38;
    short myShort = 2;
    //123, 38, 2 는 '정수 리터럴'임. 기본적으로 int자료형이지만 byte나 short 변수의 초기값으로 설정하면 아무 문제 없음.
    //그러니까 리터럴 표현 방법이라는게 long이면 2324L 이렇게 L 붙이는 방식
    //float 이면 2.34f 붙이는 방식 double이면 23.567d 붙이는 방식 이게 리터럴 표현 방법임
    return myShort;
  }

}
//문자열 연산
// + 기호를 통해 문자열을 연결 가능
//문자열과 숫자를 더하면 숫자가 저절로 문자로 바뀜, 문자랑 불리언을 더하면 불리언이 저절로 문자로 바뀜
// System.out.println("I am " + 27 + " years old.");
// System.out.println("The result is " + false + ".");
// I am 27 years old.
// The result is false.
//문자열 사이에 특수문자를 표현하고 싶을 때는 역슬래시 사용 \ 
// System.out.println("데카르트는 \"나는 생각한다. 고로 존재한다.\"라고 말했다.");
// 데카르트는 "나는 생각한다. 고로 존재한다."라고 말했다.
// \t 탭, \b 백스페이스, \n 줄바꿈, \r 줄바꿈, \f 폼피드 더 많으니까 알아보면 좋음
//그리고 윈도우에서 줄바꿈할 때는 /r/n 사용해야함
//그리고 뭐 알다시피 boolean 연산자는 <, >, =<, <=, ==, !=, &&, ||, ! 이런거있음


