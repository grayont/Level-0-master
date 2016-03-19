

void setup(){
  size(500, 200);
   fill(255, 255, 255);
  ellipse(150, 100, 125, 100);
  ellipse(350, 100, 125, 100);
 
  

  
  
}

void draw(){
  int leftx = 150;
  int lefty = 100;
  int rightx = 350;
  int righty = 100;
  
  setup();
  fill(0, 0, 0);
  ellipse(leftx, lefty, 30, 30);
  ellipse(rightx , righty, 30, 30);
  
  if(mouseX < 185){
    leftx = mouseX;
    lefty = mouseY;
  }
  
  if(mouseX > 115){
   mouseX = 150;
  mouseY= 100; 
  }
  
  if(mouseY > 60){
    mouseX = 150;
    mouseY = 100;
  }
  
  if(mouseY < 140){
    mouseX = 150;
    mouseY = 100;
  }
  
  if(mouseX > 385){
   mouseX = 150; 
  }
  
  
  
  
}
