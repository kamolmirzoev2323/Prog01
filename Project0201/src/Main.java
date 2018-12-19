import processing.core.PApplet;
import javax.swing.*;
public class Main extends PApplet {
    static int n;
    final float minr = 10;
    final float maxr = 40;
    float[] x;
    float[] y;
    float[] dx;
    float[] dy;
    float[] r;
    int[] c;
    float a;
    public void settings() {
        fullScreen();
    }
    public void setup() {
        frameRate(100);
        noStroke();
        x = new float[n];
        y = new float[n];
        dx = new float[n];
        dy = new float[n];
        r = new float[n];
        c = new int[n];
        for (int i = 0; i < n; ++i) {
            x[i] = random(width);
            y[i] = random( height);
            dx[i] = random(-2, 2);
            dy[i] = random(-2, 2);
            r[i] = random(minr, maxr);
            c[i] = (int) (0xFF000000 + random(0x00FFFFFF));
        }
    }
    public void draw()
    {
        background(0);
        for (int i = 0; i < n; i++){
            pushMatrix();
            translate(x[i],y[i]);
            rotate(a);
            a +=0.05;
            stroke(c[i]);
            strokeWeight(4);
            for(int f = 1; f<=10; f++){
                line(0,0,r[i],0);
                rotate(PI/5);}
            popMatrix();
        }
        for (int i = 0; i < n; ++i) {
            x[i] += dx[i];
            y[i] += dy[i];
            if (x[i] < 0) {
                x[i] = -x[i];
                dx[i] = -dx[i];
            }
            if (x[i] > width) {
                x[i] = width * 2 - x[i];
                dx[i] = -dx[i];
            }
            if (y[i] < 0) {
                y[i] = -y[i];
                dy[i] = -dy[i];
            }
            if (y[i] > height) {
                y[i] = height * 2 - y[i];
                dy[i] = -dy[i];
            }
        }
    }
    public static void main(String... args) {
        n = Integer.parseInt(JOptionPane.showInputDialog("N? "));
        PApplet.main("Main");
    }
}
