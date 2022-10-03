//12��
import java.util.Scanner;
class Order {
    private String S[];
    private String A[];
    private String B[];
    Scanner sc = new Scanner(System.in);
    Order() {
        S = new String[10];
        A = new String[10];
        B = new String[10];
        for(int i=0;i<10;i++) {
            S[i] = "___" ;
            A[i] = "___" ;
            B[i] = "___" ;
        }
    }

    public static void Seat(String seat[]) {
        for(int i =0;i<seat.length; i++) {
            System.out.print(" " + seat[i] + " ");
        }
        System.out.println();
    }
    public void Sel(String seat[]) {//�ڸ��� �̸��� �Է�
        System.out.print("�̸�>>");
        String name = sc.next();
        while(true) {
            System.out.print("��ȣ>>");
            int num = sc.nextInt();
            num--;

            if(seat[num].equals("___")){//�¼��� �� ���
                seat[num] = name;
                break;
            }
            else System.out.print("������ �� ���� �¼��Դϴ�.");
        }
    }
    public void Del(String seat[]) {//�ڸ����� �̸��� ����
        System.out.print("�̸�>>");
        String name = sc.next();
        for(int i=0;i<seat.length; i++) {//�ڸ����� �̸��� ã�� ___�� �ٲ�.
            if(name.equals(seat[i])) {
                seat[i] = "___";
                break;
            }
        }
    }

    public void Reserve(){
        System.out.print("�¼����� S(1), A(2), B(3)>>>");

        int select = sc.nextInt();
        switch(select) {
            case 1:
                System.out.print("S>>");
                Seat(S);
                Sel(S);
                return;
            case 2:
                System.out.print("A>>");
                Seat(A);
                Sel(A);
                return;
            case 3:
                System.out.print("B>>");
                Seat(B);
                Sel(B);
                return;

            default:
                System.out.println("�߸��� �Է��Դϴ�.");
                return;
        }
    }
    public void Search(){
        System.out.print("S>>");
        Order.Seat(S);
        System.out.print("A>>");
        Order.Seat(A);
        System.out.print("B>>");
        Order.Seat(B);

        System.out.println("<<<��ȸ�� �Ϸ��Ͽ����ϴ�>>>");
    }
    public void Cancel(){
        System.out.print("�¼����� S(1), A(2), B(3)>>>");
        int select = sc.nextInt();
        switch(select) {
            case 1:
                System.out.print("S>>");
                Seat(S);
                Del(S);
                return;
            case 2:
                System.out.print("A>>");
                Seat(A);
                Del(A);
                return;
            case 3:
                System.out.print("B>>");
                Seat(B);
                Del(B);
                return;

            default:
                System.out.println("�߸��� �Է��Դϴ�.");
                return;
        }
    }
}

public class pro12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("��ǰ�ܼ�ƮȦ ���� �ý����Դϴ�.");
        

        Order con = new Order();
        while(true) {
            System.out.print("����:1, ��ȸ:2, ���:3, ������:4>>");
            int order = sc.nextInt();

            switch(order){//swith-case�� �Է´� �޼ҵ� ����.
                case 1:
                    con.Reserve();
                    break;
                case 2:
                    con.Search();
                    break;
                case 3:
                    con.Cancel();
                    break;
                case 4:
                    sc.close();
                    return;
                default:
                    System.out.println("�߸��� ����Դϴ�.");
            }
        }
    }
}
