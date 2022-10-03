//5-1
class Point {
    private int x, y; //점의 좌표
    public void set(int x, int y) {
        this.x = x; this.y = y;
    }
    public void showPoint() { //점의 좌표 출력
        System.out.println("(" + x + "," + y + ")");
    }
}

class ColorPoint extends Point {
    private String color; //점의 색
    public void setColor(String color) {
        this.color = color;
    }
    public void showColorPoint() {
        System.out.print(color);
        showPoint(); // Point 클래스의 showPoint() 호출
    }
}

public class ColorPointEx {
    public static void main(String [] args) {
        Point p = new Point(); //객체 생성.
        p.set(1, 2);
        p.showPoint();

        ColorPoint cp =new ColorPoint();
        cp.set(3, 4);
        cp.setColor("red");
        cp.showColorPoint();
    }
}
