public class S07_87_EX32 {
    // write code here
    private double width;
    private double height;

    // Constructor with no parameter
    public S07_87_EX32() {

    }

    // Constructor with parameters
    public S07_87_EX32(double width, double height) {

        // Cheak For Width
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }

        // Cheak For Height
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    // Setters And Getters
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }

    }

    // Area Calculator
    public double getArea() {
        return width * height;
    }

}
