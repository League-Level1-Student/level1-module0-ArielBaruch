int score = 0;
 int randomNumber = (int) random(width);
int Y = 55;
void setup(){
size(600,600);
}

void draw(){
  background(120,234,158);
fill(0, 0, 0);
textSize(16);
text("Score: " + score, 20, 20);
fill(0, 0, 199);
    stroke(0,0, 199);
    ellipse(randomNumber, Y, 10, 10);
  Y = Y+15;
  fill(255,0,0);
 rect(mouseX, 500, 40, 40);
if(Y >= 500){
  Y = 55;
  checkCatch(randomNumber);
  randomNumber = (int) random(width);
}
}
void checkCatch(int x){
     if (x > mouseX && x < mouseX+100)
          score++;
     else if (score > 0)
          score--;
     println("Your score is now: " + score); }
