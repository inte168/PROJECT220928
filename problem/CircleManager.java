//6번
import java.util.Scanner;

class Circle {
    private double x, y;
    private int radius;
    public Circle(double x, double y, int radius) {
        this.x = x; this.y=y; this.radius = radius;
    }
    public void show() {
        System.out.println("(" + x + ", " + y + ")" + radius);
    }
    public int getR() {//radius를 return하는 메소드
        return radius;
    }
}

public class CircleManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle c [] = new Circle[3];
        for(int i =0; i<c.length; i++) {
            System.out.print("x, y, radius >>");
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            int radius = scanner.nextInt();
            c[i] = new Circle(x, y, radius);
        }
        // 5번 출력
        //for(int i =0; i<c.length; i++) c[i].show();
        int maxR = 0;//radius의 최대를 기록
        int tmp = -1;//radius가 최대인 index를 기록
        for(int i =0;i<c.length; i++){
            if(maxR<c[i].getR()){
                maxR = c[i].getR();
                tmp = i;
            }
        }
        System.out.print("가장 면적이 큰 원은 ");
        c[tmp].show();

        scanner.close();
    }
}
