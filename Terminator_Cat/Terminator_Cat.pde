import ddf.minim.*;        
AudioSample sound;

int rX = 785;
int rY = 480;
int lX = 540;
int lY = 460;
int acceleration = 1;

void setup(){
  PImage catPic = loadImage("cat.jpeg");
  size(catPic.width, catPic.height);
  background(catPic);
    fill(0, 0, 0);
  ellipse(540, 460, 100, 100);
  ellipse(785, 480, 100, 100);
  fill(255, 0, 0);
  ellipse(540, 460, 80, 80);
  ellipse(785, 480, 80, 80);
  Minim minim = new Minim(this);
  sound = minim.loadSample("pew.wav");
  
}

void draw(){
  fill(0, 255, 0);
  ellipse(lX, lY, 60, 60);
  ellipse(rX, rY, 60, 60);
}

void keyPressed(){
   if(acceleration == 1){
   sound.trigger(); 
  }
  rX = rX + acceleration;
  lX = lX + acceleration;
  rY = rY + acceleration;
  lY = lY + acceleration;
  acceleration = acceleration + 1;
  noStroke();
  
}
