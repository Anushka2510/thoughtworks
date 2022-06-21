import processing.core.PApplet;

public class Ball extends PApplet{
    int x,y,diameter,speed;

    public Ball(int x, int y, int diameter, int speed) {
        this.x = x;
        this.y = y;
        this.diameter = diameter;
        this.speed = speed;
    }

    public void drawball(PApplet pApplet) {
        pApplet.ellipse(x, y, diameter, diameter);
    }

    public void move(PApplet pApplet) {
        x = x + speed;
    }
}
