package telran.shapes;

public class Rectangle implements Shape {
private int width;
private int height;
public Rectangle(int width, int height) {
    this.width = width;
    this.height = height;
}

    @Override
    public int perimeter() {
      return (width + height) * 2;
    }

    @Override
    public int square() {
        return width * height;
    }

}
