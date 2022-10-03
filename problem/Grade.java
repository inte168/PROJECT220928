//2번
import java.util.Scanner;

public class Grade {
    //private로 각 점수를 저장할 변수 선언
    private int math;
    private int science;
    private int english;

    //this로 받은 math/science/english 변수를 위의 변수에 넣는다.
    Grade(int math, int science, int english) {
        this.math = math; this.science = science; this.english = english;
    }

    //평균 계산.
    public int average() {
        return (math+science+english)/3;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //입력받는 부분.
        System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력>>");
        int math = scanner.nextInt();
        int science = scanner.nextInt();
        int english = scanner.nextInt();

        //g에 받은 세 변수를 보내고 평균을 출력.
        Grade g = new Grade(math, science, english);
        System.out.println("평균은 " + g.average());

        scanner.close();
    }    
}
