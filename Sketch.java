import processing.core.PApplet;
import processing.core.PShapeSVG.Gradient;

public class Sketch extends PApplet {
  int dark = 0;
  int darkcount = 0;

  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
    // put your size call here
    size(500, 500);
  }

  /**
   * Called once at the beginning of execution. Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(210, 255, 173);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    stroke(0);
    line(height / 500, height / 2, height / 500, height);
    line((height / 500) + 2, height / 2, (height / 500) + 2, height);
    line((height / 500) + 5, height / 2, (height / 500) + 5, height);

    for (float lineY = height / 20; lineY <= height / 2; lineY += height / 20) {
      stroke(0);
      strokeWeight(3);
      line(lineY, 0, lineY, height / (5 / 2));
    }

    for (float lineX = height / 20; lineX <= height / 2; lineX += height / 20) {
      stroke(0);
      strokeWeight(3);
      line(0, lineX, height / 2, lineX);
    }

    for (int circleY = height / 20; circleY <= height / 2.22; circleY += height / 10) {
      for (int circleX = (height / 20) + height / 2; circleX <= height; circleX += height / 10) {
        stroke(0);
        strokeWeight(2);
        ellipse(circleX, circleY, 40, 40);
      }
    }

    for (float GradientY = height / 500; GradientY <= height / 2; GradientY = GradientY + 1) {
      stroke(dark);
      if (darkcount == 0) {
        stroke(0);
        
      }
      dark = dark + 1;
      darkcount = darkcount + 1;
      line(GradientY, height / 2, GradientY, height);
    }

  }
}