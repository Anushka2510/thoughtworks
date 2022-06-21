import processing.core.PApplet;

import java.util.ArrayList;

public class TryProcessing extends PApplet {
 public static final int HEIGHT=480;
 public static final int WIDTH=640;
 public static ArrayList<Ball> b = new ArrayList<>();
    @Override
    public void settings() {
        super.settings();
        size(WIDTH,HEIGHT);
    }

    @Override
    public void setup() {
        for(int i=1;i<=4;i++){
            b.add(new Ball(0,i*HEIGHT/5,20,i));
        }
    }

    @Override
    public void draw() {
//        background(255);
        for(Ball ball:b){
            ball.drawball(this);
            ball.move(this);
        }

    }

    private void drawballs(int x, int y) {
        ellipse(x, y, DIAMETER, DIAMETER);
    }

    public static void main(String[] args) {
       PApplet.main("TryProcessing",args);
    }
}
