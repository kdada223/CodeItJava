public class BankDriver{
    public static void main(String[] args){
        //사람 선언
        Person p1 = new Person();
        p1.name = "김신의";
        p1.age = 28;
        p1.cashAmount = 30000;

        //은행 계좌 생성
        BankAccount a1 = new BankAccount();
        a1.balance = 100000;

        p1.account = a1;
        a1.owner = p1;

        boolean ok1 = a1.deposit(20000); // 20000원 입금 (성공)
        System.out.println("입금 성공? " + ok1 + ok1.cashAmount);
    }
}