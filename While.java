public class While {
  public static void main(String[] args) {
    int sum = 0, i = 1;

    while (sum < 10000) {
      sum += i;
      i++;
    

    }

    System.out.println(sum);
    System.out.println(i - 1);

  }
}
//while 문은 조건 부분이 true인 동안 계속 반복해서 실행하는 구문임.
//수행 부분에서 조건이 false가 되도록 바꾸어주거나 break 를 통해서 반복문을 종료 시킬 수 있음.
//while 문은 반복횟수를 정확히 알 수 없는 동작, 혹은 특별한 조건에서만 멈추어야할 경우 등에서 자주 사용
