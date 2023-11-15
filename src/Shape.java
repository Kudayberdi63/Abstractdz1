public abstract class Shape {
    private int lenght;
    private int with;

    public Shape() {

    }


    public int getPerimeter() {
        return 0;
    }

    public Shape(int lenght, int with) {
        this.lenght = lenght;
        this.with = with;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public int getWith() {
        return with;
    }

    public void setWith(int with) {
        this.with = with;
    }

    @Override
    public String toString() {
        return " " + lenght + with;
    }

}


