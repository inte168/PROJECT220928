//8��
import java.util.Scanner;

class Phone {
    private String name;
    private String pho;

    Phone(String name, String pho) {
        this.name = name; this.pho = pho;
    }
    public String Name() {
        return name;
    }
    public String Pho() {
        return pho;
    }
}

public class PhoneBook{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        //�ο��� �Է¹���
        System.out.print("�ο���>>");
        int num = sc.nextInt();

        //�ο�����ŭ Phone�� �̿��Ͽ� �迭�� ����.
        Phone phone[] = new Phone[num];
        for(int i=0;i<num;i++) {
            System.out.print("�̸��� ��ȭ��ȣ(�̸��� ��ȣ�� �� ĭ ���� �Է�)>>>");
            String name = sc.next();
            String pho = sc.next();
            phone[i] = new Phone(name, pho);
        }
        System.out.println("����Ǿ����ϴ�...");

        while(true) {
            System.out.print("�˻��� �̸�>>");
            String name = sc.next();

            //�׸��̶�� �Է��ϸ� ����
            if(name.equals("�׸�")) break;

            int i;//�Ʒ����� �񱳸� ���� �ۿ� ����
            //�ݺ����� ���� �ϳ��� ��.
            for(i =0;i<num;i++){
                if(name.equals(phone[i].Name())) {
                    System.out.println(name + "�� ��ȣ�� " + phone[i].Pho() + "�Դϴ�.");
                    break;
                }
            }
            //�ݺ����� break�� �ƴ� ������� Ż���ϸ� ���� ���.
            if(num==i) System.out.println(name + "�� �����ϴ�.");

        }
        sc.close();
    }
}
