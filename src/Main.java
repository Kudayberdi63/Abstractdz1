public class Main {
    public static void main(String[] args) {
        Tringle tringle = new Tringle(5, 5);
        System.out.println(tringle.getPerimeter() + tringle.getPerimeter());
        System.out.println("----------------------------------------------");

        Square square = new Square(10, 10);
        System.out.println(square.getPerimeter() + square.getPerimeter());
        System.out.println("-----------------------------------------------");

        Rectangle rectangle = new Rectangle(20, 20);
        System.out.println(rectangle.getPerimeter() + rectangle.getPerimeter());


    }
}