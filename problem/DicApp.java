//10��
import java.util.Scanner;

class Dictionary {
    private static String[] kor = {"���", "�Ʊ�", "��", "�̷�", "���" };
    private static String[] eng = {"love", "baby", "money", "future", "hope" };
    public static String kor2Eng(String word) {
        for(int i =0; i<kor.length;i++) {
            if(word.equals(kor[i])){//�Է��� �ܾ�� ���� �ѱ۴ܾ ã���� �� index�� ���� �ܾ return
                System.out.print(word + "��/�� ");
                return eng[i];
            }
        }
        return "false";
    }
}

public class DicApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("�ѿ� �ܾ� �˻� ���α׷��Դϴ�.");

        while(true){
            System.out.print("�ѱ� �ܾ�?");
            String search = sc.next();
            if(search.equals("�׸�")) break; //�׸��� �ԷµǸ� ����

            String eng = Dictionary.kor2Eng(search);
            //���� �޼ҵ忡�� ã�� ���Ѱ�� false�� ���ϵ�.
            if(eng.equals("false")) System.out.println(search + "��/�� ���� ������ �����ϴ�.");
            else System.out.println(eng);
        }
        sc.close();
    }
}
