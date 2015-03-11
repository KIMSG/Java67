package step06.ex7;

/* 연산자(Operator)
 * - 데이터를 다루는 도구
 * - 자료형마다 그 자료형의 데이터를 다루는 도구가 정의되어 있다.
 * - 예) int : +, -, *, /, %, <<, >>, >>>, ...
 * - 예) boolean : &&, &, ||, |, ==, !=, 
 *           +, -, *, /, %, >>, 등은 정의되어 있지 않다. 
 */

public class Test {

  /*
  static void init(Score score, String name, int kor, int eng, int math) {
    score.name = name;
    score.kor = kor;
    score.eng = eng;
    score.math = math;
  }
  
  static void summarize(Score score) {
    score.sum = score.kor + score.eng + score.math;
  }
  
  static void average(Score score) {
    score.average = score.sum / 3f;
  }
  */
  
  public static void main(String[] args) {
    int i = 10;
    int r = i << 2;
    
    boolean b = true;
    //int r2 = b << 2; //오류! << 연산자는 boolean 자료형에 대해서는 정의되어 있지 않다.
    //int r2 = b + 2; //오류! + 연산자는 boolean 자료형에 정의되어 있지 않다.
    
    // 복합 자료형의 경우, 
    // 복합 자료형의 데이터를 다루는 연산자는? 
    // : +, -, *, /, % 등의 연산자가 따로 정의되어 있지 않다.
    // : 자료형에 명시적으로 정의해 주어야 한다. \
    // : 기존의 연산자를 정의할 수는 없다.
    //   (참고, C++에서는 정의하는 문법이 있다. 연산자 오버로딩이라 부른다.)
    // : 그럼 자바에서는 어떻게 복합 자료형의 연산자를 정의하는가?
    //   => 메서드 문법으로 정의한다.
    //   => 메서드는 객체지향 세계에서 연산자로 부른다.
    Score s1 = new Score();
    s1.name = "홍길동";
    s1.kor = 100;
    s1.eng = 90;
    s1.math = 80;
    
    Score s2 = new Score();
    s2.name = "임꺽정";
    s2.kor = 100;
    s2.eng = 100;
    s2.math = 100;
    
    Score s3 = new Score();
    s3.name = "홍길동";
    s3.kor = 100;
    s3.eng = 100;
    s3.math = 80;
    
    // Score의 인스턴스에 한 번에 값을 할당할 배정 연산자가 필요하다!
    // Score2를 확인하라!
  }

}








