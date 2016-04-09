import ddf.minim.*;
Minim minim;
AudioSample sound;

void setup(){
  background(51);
  size(1000, 500);
  minim = new Minim (this);
  sound = minim.loadSample("RIP.wav");
}

int ballx = 500;
int speed = 10;
int bally = 250;
int speedy = -10;
int numPlays = 0;
int paddleY = 485;
int paddleX = 400;
int score = 0;
int reductions = 0;

void draw(){
  background(51);
  fill(0, 255, 0);
  ellipse(ballx += speed, bally += speedy, 30, 30);
  rect(mouseX, 485, paddleX, 10);
  textSize(50);
  text(score, 20, 50);
 if(ballx >= 985){
  speed = speed * -1;
} 
if(ballx <= 15){
  speed = speed * -1;
}
if(bally <= 15){
 speedy = speedy * -1; 
}
if(bally >= 530){
  if(numPlays == 0){
  sound.trigger();
  numPlays = numPlays + 1;
  }
}
if((ballx > mouseX) && (ballx < mouseX + paddleX)){
if((bally >= paddleY - 15) && (bally <= paddleY - 14)){
  speedy = speedy * -1;
  score = score + 1;
  if(reductions < 7){
    paddleX = paddleX - 50;
    reductions = reductions + 1;
  }
  
  
}
}
}

