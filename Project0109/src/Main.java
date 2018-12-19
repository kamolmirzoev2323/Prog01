import processing.core.PApplet;
import javax.swing.*;
public class Main extends PApplet {
    static int num;
    float r = 400 / num;
    float i = 100;
    float j = 100;
    public void settings() {
        fullScreen();
    }
    public void setup() {
    }
    public void draw() {
        background(150,150,150);
        translate(width/2 -200, height/2 - 200);
        for (int i = 0; i < num * r; i += r) {
            for (int j = 0; j < num * r; j += r) {
                if (i % (r * 2) == 0 && (j + r) % (r * 2) == 0 || (i +
                        r) % (2 * r) == 0 && j % (2 * r) == 0) {
                    fill(75, 75, 75);
                    rect(j, i, r, r);
                } else {
                    fill(100, 75, 0);
                    rect(j, i, r, r);
                }
            }
        }
    }
    public static void main(String... args) {
        num = Integer.parseInt(JOptionPane.showInputDialog("Num: "));
        PApplet.main("Main");
    }
}