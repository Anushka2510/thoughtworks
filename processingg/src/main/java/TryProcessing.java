import processing.core.PApplet;

public class TryProcessing extends PApplet {
 public static final int HEIGHT=480;
 public static final int WIDTH=640;
 public static final int DIAMETER=20;
 int b1=0,b2=0,b3=0,b4=0;
    @Override
    public void settings() {
        super.settings();
        size(WIDTH,HEIGHT);
    }

//    @Override
//    public void setup() {
//
//    }

    @Override
    public void draw() {
        //background(255);
        drawballs(b1, HEIGHT/5);
        drawballs(b2, 2*(HEIGHT/5));
        drawballs(b3, 3*(HEIGHT/5));
        drawballs(b4, 4*(HEIGHT/5));
        b1=b1+1;
        b2=b2+2;
        b3=b3+3;
        b4=b4+4;
    }

    private void drawballs(int x, int y) {
        ellipse(x, y, DIAMETER, DIAMETER);
    }

    public static void main(String[] args) {
       PApplet.main("TryProcessing",args);
    }
}
