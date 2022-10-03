//����ç����.
import java.util.Scanner;


class Player {
    String name;
    String word;
    void getWordFromUser(){
        Scanner scanner = new Scanner(System.in);//��ġ�� scanner �ݱⰡ �ȵ�..
        System.out.print(name + ">>");
        String word = scanner.next();
        this.word = word;//�ܾ �ް� Ŭ���� ������ ��������.
    }
    boolean checkSuccess(String lastWord){
        //������ ����, ù���� �̾Ƴ���
        int lastIndex = lastWord.length() -1;
        char last = lastWord.charAt(lastIndex);
        char first = word.charAt(0);

        //��
        if(last != first) {//�ٸ��� false, ������ true ����.
            System.out.print(name+"��(��) �����ϴ�.");
            return false;
        }
        return true;
    }
}

public class WordGameApp {
    public static void main(String[] args){//���ο��� ���� ��� �� run �޼ҵ� ����.
        System.out.println("�����ձ� ������ �����մϴ�...");
        run();
    }

    static void run(){
        Scanner scanner = new Scanner(System.in);
        //�ο�����
        System.out.print("���ӿ� �����ϴ� �ο��� ����Դϱ�>>");
        int num = scanner.nextInt();

        //������ ����
        Player[] player = new Player[num];
        for(int i =0;i<num;i++){
            System.out.print("�������� �̸��� �Է��ϼ���>>");
            String name = scanner.next();
            player[i] = new Player();
            player[i].name = name;
        }

        //�����ϴ� �ܾ�
        System.out.println("�����ϴ� �ܾ�� �ƹ����Դϴ�.");
        String word = "�ƹ���";

        //���� ����
        int i=0;
        while(true) {
            player[i].getWordFromUser();
            if(!(player[i].checkSuccess(word))){
                break;
            }
            word = player[i].word;//���� �ܾ ��ü.
            
            if (i==num-1) i=0; //�̹��� ������ ��ȣ(num-1)�̸� 0����, �ƴϸ� ++
            else i++;
        }
        scanner.close();
    }
}
