package telran.shapes;

import run.util.Arrays;

public class Canvas implements Shape {
    Shape[] shapes;

    public Canvas() {
        shapes = new Shape[0];
    }

    public void addShape(Shape shape) {
        shapes = Arrays.insert(shapes, shapes.length, shape);
    }

    @Override
    public int perimeter() {
        int total_per = 0;
        for (Shape shapePer : shapes) {
            total_per += shapePer.perimeter();
        }
        return total_per;
    }

    @Override
    public int square() {
        int total_sq = 0;
        for (Shape shapeSq : shapes) {
            total_sq += shapeSq.square();
        }
        return total_sq;
    }

    public int canvLength() {
        return shapes.length;
    }
}
