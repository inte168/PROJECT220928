//2��
import java.util.Scanner;

public class Grade {
    //private�� �� ������ ������ ���� ����
    private int math;
    private int science;
    private int english;

    //this�� ���� math/science/english ������ ���� ������ �ִ´�.
    Grade(int math, int science, int english) {
        this.math = math; this.science = science; this.english = english;
    }

    //��� ���.
    public int average() {
        return (math+science+english)/3;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //�Է¹޴� �κ�.
        System.out.print("����, ����, ���� ������ 3���� ���� �Է�>>");
        int math = scanner.nextInt();
        int science = scanner.nextInt();
        int english = scanner.nextInt();

        //g�� ���� �� ������ ������ ����� ���.
        Grade g = new Grade(math, science, english);
        System.out.println("����� " + g.average());

        scanner.close();
    }    
}
