int X = 500;
int Yangle = 45;
int Y = 500;
int Xspeed = 25;
int Yspeed = 25;
int rand = (int) random(height);
void setup(){
  size(600,600);

  
}
void draw(){
  background(185,239,230);
  fill(240,0,0);
  stroke(150,0,0);
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
