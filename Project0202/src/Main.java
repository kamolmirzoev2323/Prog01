import processing.core.PApplet;
import javax.swing.*;
public class Main extends PApplet {
    static int n;
    final float rmin = 5;
    final float rmax = 20;
    float[] x;
    float[] dy;
    float[] y;
    float[] r;
    float[] c;
    float[] brightness;
    float angle[];
    float a[];
    public void settings() {
        fullScreen();
    }
    public void setup() {
        frameRate(100);
        x = new float[n];
        y = new float[n];
        dy = new float[n];
        r = new float[n];
        c = new float[n];
        a = new float[n];
        angle = new float[n];
        brightness = new float[n];
        for (int i = 0; i < n; ++i) {
            x[i] = random(width);
            y[i] = random(height);
            r[i] = random(rmin, rmax);
            dy[i] = r[i] / 12;
            c[i] = r[i] * 12;
            brightness[i] = r[i] * 10;
            a[i] = random(0.005f, 0.02f);
        }
    }
    public void draw() {
        background(0,49,83);
        for (int i = 0; i < n; ++i) {
            pushMatrix();
            translate(x[i], y[i]);
            rotate(angle[i]);
            angle[i] += a[i] ;
            if(angle[i] > PI/6){
                a[i] = - a[i];
            }
            if(angle[i] < - PI/6){
                a [i] = - a[i];
            }
            y[i] += dy[i];
            stroke(c[i], brightness[i]);
            strokeWeight(3);
            line(-r[i], 0, r[i], 0);
            line(0, -r[i],0, r[i]);
            line(-r[i]*3/4, -r[i]*3/4, r[i]*3/4, r[i]*3/4);
            line(-r[i]*3/4, r[i]*3/4, r[i]*3/4, -r[i]*3/4);
            if (y[i] > height + r[i]) {
                y[i] = -r[i];
                dy[i] = dy[i];
            }
            popMatrix();
        }
    }
    public static void main(String... args) {
        n = Integer.parseInt(JOptionPane.showInputDialog("Number of Stars:"));
        PApplet.main("Main");
    }
}