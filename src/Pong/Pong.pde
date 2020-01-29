boolean intersects(int ballX, int ballY, int paddleX, int paddleY, int paddleLength) {
     if (ballY > paddleY && ballX > paddleX && X < paddleX + paddleLength)
          return true;
     else
          return false;
    }

int X = 500;
int Yangle = 45;
int Y = 500;
int Xspeed = 5;
int Yspeed = 5;
int rand = (int) random(height);
void setup(){
  size(600,600);
 
}
void draw(){
 if(intersects(X,Y,mouseX,550,70)== true){
 Yangle=+Yangle;
 }
  background(185,239,230);
  rect(mouseX,550, 70,10);
    
fill(240,0,0);
stroke(240,0,0);
  ellipse(X,Y, 40,40);
X= X+Xspeed;
Y= Y+Yspeed;
  Y = Y+Yangle;
  if(X >= width){
  Xspeed=-Xspeed;
  }
if(X <= 0){
  Xspeed=-Xspeed;
  }
if(Y >= height){
  Yspeed=-Yspeed;
Yangle=-Yangle;
}
  
if(Y <= 0){
  Yspeed=-Yspeed;
Yangle=-Yangle;  
}
}
