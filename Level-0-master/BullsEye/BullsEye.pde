size(100, 100);
ellipse(50, 50, 100, 100);
for(int i = 10; i > 0; i--){
noFill();


if((i % 3) == 1){
  fill(0, 0, 255);
}
else if((i % 3) == 2){
 fill(255, 0, 0); 
}
else{
 fill(255, 255, 255); 
}
ellipse(50, 50, i * 10, i * 10);
}

