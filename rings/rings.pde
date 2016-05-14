float r = 0.1;
boolean plus, minus = false;

void setup(){
  size(800,500);
  smooth(8);
}

void draw(){
  background(200);
  for(int i=300; i>0; i=i-10){
    pushMatrix();
    translate(width/4,height/4);
    noFill();

     strokeWeight(2);
  ellipse(r,100,i,i);
  popMatrix();
}
  for(int j=300; j>0; j=j-10){
    pushMatrix();
    translate(width/4,height/4);
    noFill();

  ellipse(350-r,100,j,j);
  popMatrix();
}
if(r<5){
      plus=true;
    minus=false;

}
if(r>450){
      plus=false;
    minus=true;

}
if(plus){
 r=r+0.2;
}
if (minus){
  r=r-0.1;
}

}

