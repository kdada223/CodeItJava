public class For {
  public static void main(String[] args) {
    int sum = 0;
    for (int i = 0; i <= 5; i++) {
      sum += 1;
    }
    System.out.println(sum);
  }
}
//for문 알다시피 초기화; 조건; 증감; 이렇게 3가지의 식으로 구성되어 있고
//while문과 달리 초기화 식이 있고 for문 안에서만 쓸 수 있는 변수를 만들 수 있어.
//반복 인덱스가 필요한 경우, 반복 최대 횟수가 정해진 경우, 갯수가 정해진 데이터 셋의 내용을 하나씩 봐야할 경우
//에 주로 사용함.