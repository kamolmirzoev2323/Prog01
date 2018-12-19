import processing.core.PApplet;
public class Main extends PApplet {
    int x = width / 2;
    int y = height / 2;
    int dx = 4;
    int dx1 = 4;
    int dx2 = 4;
    int dy = 4;
    int dy1 = 4;
    int dy2 = 4;
    int r = 25;
    int x1 = x + 30;
    int x2 = x - 30;
    int y1 = x + 30;
    int y2 = x - 30;
    public void settings() {
        fullScreen();
    }
    public void setup() {
    }
    public void draw() {
        frameRate(100);
        background(0);
        fill(255, 0, 0);
        ellipse(x, y, r, r);
        x += dx;
        y += dy;
        if (x > width - r) {
            x = width - r;
            dx = -dx;
        }
        if (x < r) {
            x = r;
            dx = -dx;
        }
        if (y > height - r) {
            y = height - r;
            dy = -dy;
        }
        if (y < r) {
            y = r;
            dy = -dy;
        }
        fill(0, 255, 0);
        ellipse(x1, y1, r, r);
        x1 += dx1;
        y1 += dy1;
        if (x1 > width - r) {
            x1 = width - r;
            dx1 = -dx1;
        }
        if (x1 < r) {
            x1 = r;
            dx1 = -dx1;
        }
        if (y1 > height - r) {
            y1 = height - r;
            dy1 = -dy1;
        }
        if (y1 < r) {
            y1 = r;
            dy1 = -dy1;
        }
        fill(255, 255, 0);
        ellipse(x2, y2, r, r);
        x2 += dx2;
        y2 += dy2;
        if (x2 > width - r) {
            x2 = width - r;
            dx2 = -dx2;
        }
        if (x2 < r) {
            x2 = r;
            dx2 = -dx2;
        }
        if (y2 > height - r) {
            y2 = height - r;
            dy2 = -dy2;
        }
        if (y2 < r) {
            y2 = r;
            dy2 = -dy2;
        }
    }
    public static void main(String... args) {
        PApplet.main("Main");
    }
}