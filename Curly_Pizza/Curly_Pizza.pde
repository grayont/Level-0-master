import ddf.minim.*;
AudioSample sound;
void setup () {
  size(500, 500);
  fill(221, 153, 68);
  ellipse(250, 250, 350, 350);
  fill(255, 0, 0);
  ellipse(250, 250, 320, 320);
  fill(255, 255, 0);
  ellipse(250, 250, 300, 300);
  Minim minim = new Minim (this);
  sound = minim.loadSample("Whoop.mp3");
}

void draw () {
  if (mousePressed) {
    PImage curly = loadImage ("curly.gif");
  curly.resize(30, 40);
  sound.trigger();
  image (curly, mouseX - 15, mouseY - 20);
  }
    
}




