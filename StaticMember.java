//4-12
import java.util.Scanner; //예제에 없으나 스캐너 사용.

class CurrencyConverter {
    private static double rate; // 한국 원화에 대한 환율
    public static double toDollar(double won) {
        return won/rate; //원-달러 변환
    }
    public static double toKWR(double dollar) {
        return dollar * rate; //달러-원 변환
    }
    public static void setRate(double r) {
        rate = r; //환율 설정
    }
}

public class StaticMember {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("환율(1달러) >> ");
        double rate = scanner.nextDouble();
        CurrencyConverter.setRate(rate); //미 환율 설정
        System.out.println("백만원은 $" + CurrencyConverter.toDollar(1000000) + "입니다.");
        System.out.println("$100는 " + CurrencyConverter.toKWR(100) + "원입니다.");
        scanner.close();
    }
}
