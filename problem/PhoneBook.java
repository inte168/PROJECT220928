//8번
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
        
        //인원수 입력받음
        System.out.print("인원수>>");
        int num = sc.nextInt();

        //인원수만큼 Phone을 이용하여 배열에 저장.
        Phone phone[] = new Phone[num];
        for(int i=0;i<num;i++) {
            System.out.print("이름과 전화번호(이름과 번호는 빈 칸 없이 입력)>>>");
            String name = sc.next();
            String pho = sc.next();
            phone[i] = new Phone(name, pho);
        }
        System.out.println("저장되었습니다...");

        while(true) {
            System.out.print("검색할 이름>>");
            String name = sc.next();

            //그만이라고 입력하면 종료
            if(name.equals("그만")) break;

            int i;//아래에서 비교를 위해 밖에 정의
            //반복문을 통해 하나씩 비교.
            for(i =0;i<num;i++){
                if(name.equals(phone[i].Name())) {
                    System.out.println(name + "의 번호는 " + phone[i].Pho() + "입니다.");
                    break;
                }
            }
            //반복문을 break가 아닌 방법으로 탈출하면 없는 경우.
            if(num==i) System.out.println(name + "이 없습니다.");

        }
        sc.close();
    }
}
