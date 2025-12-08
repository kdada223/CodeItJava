public class BankAccount{
  int balance; //현재 잔고
  Person owner;

//파라미터 : 입금할 액수 (정수)
// 리턴 : 성공여부(불린)
  boolean deposit(int amount){
    //입금 성공 시 true 실패시 false 리턴
    //입금 성공하면 현재잔고 balance에 파라미터로 받은 금액 amount을 더함
    //입금 성공하면 계좌주의 현금액 cashAmount을 입금액 만큼 차감
    //입금할 금액이 음수면 입금실패(0원은 입금 가능)
    //계좌주의 현금이 입금액보다 작을 경우 입금 실패
    //입금 실패 시 다음과 같은 내용 출력
    //입금 실패입니다. 잔고: xx원, 현금: xx원
    //성공시?
    //xx원 입금하였습니다. 잔고: xx원, 현금: xx원
    if(amount > owner.cashAmount){
      System.out.println("실패 했음 돈이 부족함");
      return false;
    }
    if(amount == 0){
        System.out.println("입금 성공 0원입금");
        return false;
    }
    if(amount < 0){
       System.out.println("마이너스 통장임? 0원 이상 입금하셈");
       return false;
    }

    owner.balance += amount;
    owner.cashAmount -= amount;
     System.out.println("입금 성공!");
    return true;
}

//파라미터 : 출금할 액수 (정수)
//리턴 : 성공여부 (불린)
boolean withdraw(int amount){

}
//첫번째 파라미터 : 받는 사람 (Person)
//두번째 파라미터 : 이체할 금액 (정수)
//리턴 : 성공여부 (불린)
boolean transfer(Person to, int amount){

}
}


