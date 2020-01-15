
 int randomNumber = (int) random(width);
int Y = 55;
void setup(){
size(600,600);
}
void draw(){
background(120,234,158);
fill(0, 0, 199);
    stroke(0,0, 199);
    ellipse(randomNumber, Y, 10, 10);
  Y ++;
if(Y == 600){
  Y = 55;
  randomNumber = (int) random(width);
 rect(mouseX, 450, 40, 40);
}
}
