int randX;
int randY; 
void setup() {
  size(600, 600);
  background(0, 0, 0);
}
void draw() {
  randX = (int) random(width);
  randY = (int) random(height);
  makeMagical();
  for (int i = 0; i<=300; i++) {
    if (i%2==0) {
      fill(230, 0, 0);
    
  } else {
  fill(0, 230, 0);
}
  

stroke(230, 0, 0);
ellipse(getWormX(i), getWormY(i), 10, 10);
  }
if (mousePressed) {
for(int g = 0; g<=1; g++){
stroke(230, 0, 0);
ellipse(getWormX(g), getWormY(g), 50, 50);
}
}
}


float frequency = .001;
float noiseInterval = PI;

void makeMagical() {
  fill( 0, 0, 0, 10 );
  rect(0, 0, width, height);
  noStroke();
}

float getWormX(int i) {
  return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
}

float getWormY(int i) {
  return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
}
