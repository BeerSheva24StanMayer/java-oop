import org.junit.jupiter.api.Test;

import telran.shapes.Canvas;
import telran.shapes.Rectangle;
import telran.shapes.Square;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static telran.shapes.Shape.*;

import java.util.concurrent.CancellationException;

public class TestShapes {

    @Test
    void TestRectangle() {
        Rectangle rectangle = new Rectangle(10, 20);

        assertEquals(60, rectangle.perimeter());
        assertEquals(200, rectangle.square());

    }

    @Test
    void TestSquare() {
        Square square = new Square(60);

        assertEquals(240, square.perimeter());
        assertEquals(3600, square.square());

    }

    @Test
    void TestCanvas() {
        Canvas canvas = new Canvas();
        Rectangle rectangle = new Rectangle(10, 20);
        Square square = new Square(60);

        //first add to shapes
        canvas.addShape(square);
        canvas.addShape(rectangle);
        int expected_length = 2;
        int expected_square = square.square() + rectangle.square();
        int expected_perimetr = square.perimeter() + rectangle.perimeter();

        assertEquals(expected_length, canvas.canvLength());
        assertEquals(expected_length, canvas.canvLength());assertEquals(expected_square, canvas.square());
        assertEquals(expected_perimetr, canvas.perimeter());

        Canvas canvas2 = new Canvas();
        //adding to second shapes
        canvas2.addShape(square);
        canvas2.addShape(square);
        canvas2.addShape(rectangle);
        int expected_length2 = 3;
        int expected_square2 = square.square() * 2 + rectangle.square();
        int expected_perimetr2 = square.perimeter() * 2 + rectangle.perimeter();

        assertEquals(expected_length2, canvas2.canvLength());
        assertEquals(expected_square2, canvas2.square());
        assertEquals(expected_perimetr2, canvas2.perimeter());

        //adding second shapes to main shapes
        canvas.addShape(canvas2);
        int expected_length3 = 3;
        int expected_square3 = square.square() * 3 + rectangle.square() * 2;
        int expected_perimetr3 = square.perimeter() * 3 + rectangle.perimeter() * 2;

        assertEquals(expected_length3, canvas.canvLength());
        assertEquals(expected_square3, canvas.square());
        assertEquals(expected_perimetr3, canvas.perimeter());

    }
}
