//12번
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
    public void Sel(String seat[]) {//자리에 이름을 입력
        System.out.print("이름>>");
        String name = sc.next();
        while(true) {
            System.out.print("번호>>");
            int num = sc.nextInt();
            num--;

            if(seat[num].equals("___")){//좌석이 빈 경우
                seat[num] = name;
                break;
            }
            else System.out.print("선택할 수 없는 좌석입니다.");
        }
    }
    public void Del(String seat[]) {//자리에서 이름을 삭제
        System.out.print("이름>>");
        String name = sc.next();
        for(int i=0;i<seat.length; i++) {//자리에서 이름을 찾아 ___로 바꿈.
            if(name.equals(seat[i])) {
                seat[i] = "___";
                break;
            }
        }
    }

    public void Reserve(){
        System.out.print("좌석구분 S(1), A(2), B(3)>>>");

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
                System.out.println("잘못된 입력입니다.");
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

        System.out.println("<<<조회를 완료하였습니다>>>");
    }
    public void Cancel(){
        System.out.print("좌석구분 S(1), A(2), B(3)>>>");
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
                System.out.println("잘못된 입력입니다.");
                return;
        }
    }
}

public class pro12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("명품콘서트홀 예약 시스템입니다.");
        

        Order con = new Order();
        while(true) {
            System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>>");
            int order = sc.nextInt();

            switch(order){//swith-case로 입력당 메소드 구분.
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
                    System.out.println("잘못된 명령입니다.");
            }
        }
    }
}
