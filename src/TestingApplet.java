import processing.core.*;

public class TestingApplet extends PApplet{

	private String URL = "palmTrees.jpg";
	private PImage backgroundImage;
	
	public void setup() {
		
		size(200,200);
		backgroundImage = loadImage(URL,"jpg");
		
	}
	
	public void draw() {
		backgroundImage.resize(0,height);
		image(backgroundImage,0,0);
		if (hour() > 15) {
			
			fill(255,150,0);
		}
		else {
			fill(255,209,0);
		}
		ellipse(width/4, height/5, width/5, height/5);
	}

}
