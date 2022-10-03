//4��
class Rectangle{
    //���� private�� ����
    private int x;
    private int y;
    private int width;
    private int height;

    Rectangle(int x, int y, int width, int height) {//������
        this.x = x; this.y = y; this.width = width; this.height = height;
    }
    public int square(){//���� = �ʺ�*����
        return width*height;
    }
    public void show(){//���
        System.out.println("(" + x + ", " + y + ")���� ũ�Ⱑ " + width + "x" + height + "�� �簢��");
    }
    boolean contains(Rectangle r){// �־��� ������ ����/������θ� ���Ƿ� ���� ����/�ϴܿ� �־�� �ϰ�, ���� ���� ����/���.
        if(x<r.x && y<r.y && (x+width)>(r.x+r.width) && (y+height)>(r.y+r.height))
            return true;
        return false;
    }
}

public class pro4 {
    public static void main(String args[]) {
        //3���� ���簢��.
        Rectangle r = new Rectangle(2, 2, 8, 7);
        Rectangle s = new Rectangle(5, 5, 6, 6);
        Rectangle t = new Rectangle(1, 1, 10, 10);

        r.show();
        System.out.println("s�� ������ " + s.square());
        if(t.contains(r)) System.out.println("t�� r�� �����մϴ�.");
        if(t.contains(s)) System.out.println("t�� s�� �����մϴ�.");
    }
}
