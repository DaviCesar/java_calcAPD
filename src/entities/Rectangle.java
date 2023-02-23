package entities;

public class Rectangle {
    public double width;
    public double height;

    public double calcArea(){
        return width * height;
    }

    public double calcPerimeter(){
        return 2 * (width + height);
    }

    public double calcDiagonal(){
        return Math.pow(width, 2) + Math.pow(height, 2);
    }
}
    