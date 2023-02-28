
interface Shape {
    int getArea();
}

class Rectangle implements Shape {
    protected int m_width;
    protected int m_height;

    public Rectangle(int width, int height) {
        m_width = width;
        m_height = height;
    }

    public int getWidth() {
        return m_width;
    }

    public void setWidth(int width) {
        m_width = width;
    }

    public int getHeight() {
        return m_height;
    }

    public void setHeight(int height) {
        m_height = height;
    }

    @Override
    public int getArea() {
        return m_width * m_height;
    }
}

class Square implements Shape {
    protected int m_sideLength;

    public Square(int sideLength) {
        m_sideLength = sideLength;
    }

    public int getSideLength() {
        return m_sideLength;
    }

    public void setSideLength(int sideLength) {
        m_sideLength = sideLength;
    }

    @Override
    public int getArea() {
        return m_sideLength * m_sideLength;
    }
}



public class ShapesAnalyze {
    public static void main(String[] args) {

        Rectangle rectangleObject = new Rectangle(5,10);

        System.out.println("Area of Rectangle : "+rectangleObject.getArea());

        Square squareObject = new Square(5);

        System.out.println("Area of Square : "+squareObject.getArea());
    }
}