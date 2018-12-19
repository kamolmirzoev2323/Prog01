import processing.core.PApplet;
import javax.swing.*;
public class Main extends PApplet {
    static String fW;
    static String sW;
    float x1;
    float x2;
    float dx1 = 3;
    float dx2 = 3;
    public void settings() {
        fullScreen();
    }
    public void setup() {
        x1 = 0;
        x2 = 0;
        frameRate(100);
    }
    public void draw() {
        background(0);
        pushMatrix();
        translate(width / 2, height / 4);
        textSize(200);
        fill(0,255,0);
        textAlign(CENTER, CENTER);
        text(fW, x1, 0);
        x1 += dx1;
        if (x1 > width / 2 - textWidth(fW) / 2) {
            dx1 = -dx1;
            dx2 = -dx2;
        }
        if (x1 < textWidth(fW) / 2 - width / 2) {
            dx1 = -dx1;
            dx2 = -dx2;
        }
        fill(255,255,0);
        textSize(200);
        textAlign(CENTER, CENTER);
        text(sW, x2, height/2);
        x2 -= dx2;
        if (x2 > width / 2 - textWidth(sW) / 2) {
            dx1 = -dx1;
            dx2 = -dx2;
        }
        if (x2 < textWidth(sW) / 2 - width / 2) {
            dx1 = -dx1;
            dx2 = -dx2;
        }
        popMatrix();
    }
    public static void main(String... args) {
        fW = JOptionPane.showInputDialog("firstWord: ");
        sW = JOptionPane.showInputDialog("secondWord: ");
        PApplet.main("Main");
    }
}