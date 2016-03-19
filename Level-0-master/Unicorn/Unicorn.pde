PImage rainbow;
PImage unicorn;

void setup() {
rainbow = loadImage("rainbow.png");
size(rainbow.width, rainbow.height);
background(rainbow);
 unicorn = loadImage("unicorn.png");
}

void draw() {
image(unicorn, mouseX - 700, mouseY - 500);

if(mousePressed){
  setup();
}

}
