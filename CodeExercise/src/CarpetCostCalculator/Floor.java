package CarpetCostCalculator;

public class Floor {
    private double width;
    private double length;

    public Floor(double width, double length) {
        setWidth(width);
        setLength(length);
    }

    public double getArea(){
        return width * length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width >= 0 )
            this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length >= 0)
            this.length = length;
    }
}

