//6��
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
    public int getR() {//radius�� return�ϴ� �޼ҵ�
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
        // 5�� ���
        //for(int i =0; i<c.length; i++) c[i].show();
        int maxR = 0;//radius�� �ִ븦 ���
        int tmp = -1;//radius�� �ִ��� index�� ���
        for(int i =0;i<c.length; i++){
            if(maxR<c[i].getR()){
                maxR = c[i].getR();
                tmp = i;
            }
        }
        System.out.print("���� ������ ū ���� ");
        c[tmp].show();

        scanner.close();
    }
}
