import processing.core.*;

public class App extends PApplet {
    public static void main(String[] args)  {
        PApplet.main("App");
    }

    public void settings() {
        size(400,400);
    }

    public void setup() {
        background(255);
        
        fill(0,200,0);
        stroke(0, 0, 255);
        strokeWeight(6);
        rect(200,200,100,100);

        fill(0,0,200);
        stroke(0,200,0);
        strokeWeight(6);
        ellipse(100,200,100,100);

        stroke(200,0,0); 
        strokeWeight(6);
        line(100, 150, 200, 200);

    }
}
