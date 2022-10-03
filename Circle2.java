//4-3
public class Circle2 {//이전에 Circle클래스가 있어서 Circle2로 명명.
    int radius;
    String name;

    public Circle2() {
        radius = 1; name = "";
    }
    public Circle2(int r, String n) { //매개변수 있는 생성자.
        radius = r; name = n;
    }
    public double getArea() {
        return 3.14*radius*radius;
    }

    public static void main(String[] args) {
        Circle2 pizza = new Circle2(10, "자바피자"); //Circle2 객체 생성

        double area = pizza.getArea();
        System.out.println(pizza.name + "의 면적은 " + area);

        Circle2 donut = new Circle2();
        donut.name = "도넛피자";
        area = donut.getArea();
        System.out.println(donut.name + "의 면적은 " + area);
    }
}
