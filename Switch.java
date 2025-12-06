public class Switch {
  public static void main(String[] args) {
    int score = 77;
    String grade;

    switch (score / 10) {
      case 10:
        grade = "A+";
        break;
      case 9:
        grade = "A";
        break;
      case 8:
        grade = "B";
        break;
      case 7:
        grade = "C";
        break;
      case 6:
        grade = "D";
        break;
      default:
        grade = "F";
        break;
    }
    switch (grade) {
      case "A+":
      case "A":
      case "B":
        System.out.println("참 잘했어요!");
        break;
      case "C":
      case "D":
        System.out.println("조금만 더 노력해보아요");
        break;
      case "F":
        System.out.println("에휴..재수강하삼");
        break;
      default:
        System.out.println("입력 오류!");
        break;
    }

    System.out.println(grade);
  }
}
//이렇게 쓰듯 합-불, 옳다-그르다 등과 같은 방식으로 흐름을 나누는 것보다 여러 개의 동등한 조건의 나열에는 switch문이 더 편리함