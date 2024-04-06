package EX21_40;
public class S07_87_EX33 {
 
    private int x;
    private int y;
 
    public S07_87_EX33() {}
 
    public S07_87_EX33(int x, int y) {
        this.x = x;
        this.y = y;
    }
 
    public int getX() {
        return x;
    }
 
    public void setX(int x) {
        this.x = x;
    }
 
    public int getY() {
        return y;
    }
 
    public void setY(int y) {
        this.y = y;
    }
 
    public double distance() {
        return distance(0, 0);
    }
 
    public double distance(S07_87_EX33 a) {
        return distance(a.x, a.y);
    }
 
    public double distance(int x, int y) {
        
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }
}