package lab2;

public class StartTriangle {
    private int width;

    public StartTriangle(int width) {
        this.width = width;
    }
    @Override
    public String toString() {
        StringBuilder triangle = new StringBuilder();
        for(int i = 1; i <= width; i++) {
            for(int j = 1; j <= i; j++) {
                triangle.append("[*]");
            }
            triangle.append("\n");
        }
        return triangle.toString();
    }
}

