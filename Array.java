public class Array {
  public static void main(String[] args) {
    //배열 생성
    //int[] arr = new int[5];

    //배열 index 번호에 값 넣기
    // arr[0] = 2;
    // arr[1] = 3;
    // arr[2] = 5;
    // arr[3] = 6;
    // arr[4] = 11;

    // for (int i = 0; i < arr.length; i++) {
      //   System.out.println(arr[i]);
      // }


    //배열 선언과 동시에 빈 배열 생성
    //int[] intArray = new int[5]; // 크기 5의 빈 배열
    //선언 후, 배열 생성
    //int[] intArray2;
    //intArray2 = new int[5]; // 크기 5의 빈 배열

    //리터럴로 생성
    // int[] intArray = {1, 2, 3, 4, 5};
    //intArray는 자동으로 크기 5의 배열이 됨.
    //그런데 이 방식은 변수를 정의할 때만 할 수 있음. 밑에 코드처럼 두 줄에 나눠서 하면 오류가 나옴.
    // int[] intArray;
    // intArray={1,2,3,4,5}; // 오류

    //만약에 배열의 크기가 5인 상황에 intArray[5] = 6;
    //범위를 벗어나는 코드를 입력하면 런타임에 오류가 나옴.
    //런타임이란?
    //코드 작성 시점이 아니라 실제 실행될 때를 뜻함. intArray[5] = 6; 을 적었을 때는 오류가 없음.
    //문법적으로 오류가 없기 때문임. 그런데 실제 실행을 해 접근을 하려고 하면 문제가 생김.
    
    //앨리어싱
    //int[] arr1 = {1, 2, 3, 4, 5};
    // int[] arr2 = arr1;
    // arr1[0] = 100;  
    // System.out.println(arr2[0]);
    //이렇게 배열을 통째로 넘기는걸 뜻함.
    //이렇게 출력해보면 arr2[0] 값도 100으로 나옴
    //잘 생각해보면 arr1의 배열을 arr2에 할당해주는게 arr1[0]번째 값에 재할당하는 것보다 위에 있는데 
    //왜 저렇게 나오는거임? 자바에서 배열은 참조타입이기 때문.
    //즉 int[] arr2 = arr1; 이 코드는 arr1배열의 주소를 arr2에 복사하는 것임.
    //그래서 같은 배열 객체를 가리키고 있음. 따라서 arr1[0] 값을 100으로 바꾸면
    //arr2도 같은 배열을 참조하므로 100이 됨.

    //그렇다면 arr1을 arr2에 새롭게 복사하고 싶으면 어떻게 하냐?
    //즉 참조하는게 아니라 arr2라는 배열이 새롭게 생성되려면 어떻게 하냐?
    int[] arr1 = {1, 2, 3, 4, 5};
    int[] arr2 = arr1.clone();

    arr1[0] = 100;
    System.out.println(arr1[0]);
    System.out.println(arr2[0]);

    //for-each 라는 문법이 있음. 어떻게 쓰냐?
    for (int i : arr1) {
      System.out.println("foreach입니다" + i);
    }
    //이렇게 쓰면 수행 부분으로 들어갈 때는 i는 0으로 시작해 배열의 마지막까지 돌게됨
    for (double i : arr1) {
      System.out.println(i);
    }
    //형 변환을 해도 double에 int값을 넣으면 형 변환이 되는거기에 문제가 없음.
    

   
  } 
}
