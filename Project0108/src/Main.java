import processing.core.PApplet;

public class Main extends PApplet {
    float x;
    float y;
    float alphaEarth = 0;
    float alphaMerc = 0;
    float alphaMoon = 0;
    float rSun = 100;
    public void settings() {
        fullScreen();
    }
    public void setup() {
        x = width / 2;
        y = height / 2;
        frameRate(100);
    }
    public void draw() {
        background(0,30,70);
        pushMatrix();
        translate(width / 2, height / 2);
        rotate(alphaMerc);
        alphaMerc += 0.04f;
        fill(200, 200, 0);
        ellipse(0, 0, rSun, rSun);
        fill(200, 0, 0);
        ellipse(110, 0, rSun / 4, rSun / 4);
        popMatrix();
        pushMatrix();
        translate(width/2,height/2);
        rotate(alphaEarth);
        alphaEarth += 0.01f;
        fill(0,200,0);
        ellipse(0,200,rSun/2,rSun/2);
        translate(0,200);
        rotate(alphaMoon);
        alphaMoon += 0.07f;
        fill(100,100,100);
        ellipse(0,rSun/2, rSun/8, rSun/8);
        popMatrix();
    }
    public static void main(String... args) {
        PApplet.main("Main");
    }
}