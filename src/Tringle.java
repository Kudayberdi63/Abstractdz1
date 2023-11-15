public class Tringle extends Shape {
    public Tringle() {
        super();
    }

    public Tringle(int lenght, int with) {
        super(lenght, with);
    }

    @Override
    public int getPerimeter() {
        System.out.println("торт бурчтук:" + getLenght());
        System.out.println("торт бурчтук:" + getWith());
        return getLenght() + getWith() + getWith() + getLenght();

    }
}




