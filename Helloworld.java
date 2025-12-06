public class Helloworld {
  public static void main(String[] args) {
    System.out.println("hello,World");
    
  }
}
//함수작성방법
// class Helloworld 클래스 정의하는 방법 그냥 우리 JS에서 function 함수명() 함수명이랑 동일하다고 생각하면 됨
// 앞에 public은 접근 제어자인데 이거는 C언어 배웠을 때 private이랑 public 차이 배웠던거 기억하지? 그거랑 동일함
// 이런 애들을 다 접근 제어자 라고 부름 그리고 하나 더 있는데 protected 이런 것도 있음
// 그 안에 public static void main(String[] args) {System.out.println("hello,World");} 이걸 살펴보자
// main은 메소드 이름(함수) 예전에 유니티 했을 때랑 비슷함
// 일단 main이라고 지어야 java가 메인을 찾아서 실행시킴
// 그리고 파라미터 자리를 보면 args라는 문자열 배열을 파라미터로 받음 args(파라미터) String[](문자열배열)
// void는 메소드의 리턴 값의 자료형(void일 경우 리턴 값이 없음)
// 그 앞에는 또 접근 제어자 public이 있고 static은 객체 지향 프로그래밍에 중요한 키워드임
// 간단하게 설명하면 static은 그 부분을 바로 실행 가능하게 만들어주삼~ 이라는 말임
// main이 가장 첫 번째로 실행되어야 하기 때문에 항상 static을 붙임
// System.out.println("hello,World");
// 시스템이라는 클래스의 out이라는 변수의 printIn 이라는 메소드를 호출하셈 이라는 말임
// 이 메소드의 파라미터로 문자열 Hello world를 출력하면 됨
// 변수 이름 규칙이 있는데 대소문자, 숫자 시작X, 자바 예약어 사용 불가, 특수 기호 _(언더바), $(달러사인) 제외 사용 불가