public class Rectangle {
        private double length;
        private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        double area = length * width;
        return area;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", area=" + this.getArea() +
                ", diagonal=" + this.getDiagonal() +
                ", issquare=" + this.isSquare() +
                '}';
    }

    public double getDiagonal() {
        double x = length*length;
        double y = width*width;
        double z = Math.sqrt(x+y);
        return z;
    }

    public boolean isSquare(){
        if (length==width){
            return true;
        }else{
            return false;
        }
    }
}

