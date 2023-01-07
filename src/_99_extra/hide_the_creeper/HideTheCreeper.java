package _99_extra.hide_the_creeper;

import processing.core.PApplet;
import processing.core.PImage;

public class HideTheCreeper extends PApplet {
	static final int WIDTH = 600;
	static final int HEIGHT = 400;
	PImage creeper;

	@Override
	public void settings() {
		size(WIDTH, HEIGHT);
	}

	@Override
	public void setup() {
		PImage minecraft = loadImage("grass.jpeg");
		minecraft.resize(WIDTH, HEIGHT);
		background(minecraft);
		creeper = loadImage("creeper.jpeg");
		creeper.resize(5,5);
	}

	@Override
	public void draw() {
		image (creeper, 200, 300);

	}
	public void mousePressed() {
		fill(265,0,0);
		ellipse(mouseX, mouseY, 10, 10); 		
		if(isNear(mouseX,200)&& isNear(mouseY, 300)) {
			fill(0,265,0);
			ellipse(mouseX, mouseY, 10, 10);
		}
	}
	boolean isNear(int a, int b) {
		if (abs(a - b) < 10)
		     return true;
		else
		     return false;
		}
	
	static public void main(String[] args) {
		PApplet.main(HideTheCreeper.class.getName());
	}
}
