public class Rectangle extends Shape {


    public Rectangle(int lenght, int with) {
        super(lenght, with);
    }

    @Override
    public int getPerimeter() {
        System.out.println("торт бурчтук");
        return getLenght() + getWith() + getWith();
    }
}
