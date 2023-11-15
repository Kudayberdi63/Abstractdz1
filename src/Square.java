public class Square extends Shape {
    public Square(int lenght, int with) {
        super(lenght, with);
    }

    @Override
    public int getPerimeter() {
        System.out.println("уч бурчтук");
        return getLenght() + getWith() + getLenght();
    }
}


