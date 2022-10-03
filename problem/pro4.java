//4번
class Rectangle{
    //변수 private로 선언
    private int x;
    private int y;
    private int width;
    private int height;

    Rectangle(int x, int y, int width, int height) {//생성자
        this.x = x; this.y = y; this.width = width; this.height = height;
    }
    public int square(){//넓이 = 너비*높이
        return width*height;
    }
    public void show(){//출력
        System.out.println("(" + x + ", " + y + ")에서 크기가 " + width + "x" + height + "인 사각형");
    }
    boolean contains(Rectangle r){// 주어진 점에서 우측/상단으로만 가므로 점이 좌측/하단에 있어야 하고, 최종 점은 우측/상단.
        if(x<r.x && y<r.y && (x+width)>(r.x+r.width) && (y+height)>(r.y+r.height))
            return true;
        return false;
    }
}

public class pro4 {
    public static void main(String args[]) {
        //3개의 직사각형.
        Rectangle r = new Rectangle(2, 2, 8, 7);
        Rectangle s = new Rectangle(5, 5, 6, 6);
        Rectangle t = new Rectangle(1, 1, 10, 10);

        r.show();
        System.out.println("s의 면적은 " + s.square());
        if(t.contains(r)) System.out.println("t는 r을 포함합니다.");
        if(t.contains(s)) System.out.println("t는 s를 포함합니다.");
    }
}
