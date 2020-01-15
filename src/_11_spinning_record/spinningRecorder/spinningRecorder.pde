import ddf.minim.*;             //at the very top of your sketch
Minim minim;        //as a member variable
  AudioPlayer song;      //as a member variable
int angle = 0;
PImage pictureOfRecord;                        //as member variable
        void setup(){
        size(600,600);                                 //in setup method
        pictureOfRecord= loadImage("record.png");      //in setup method
      pictureOfRecord.resize(600,600);     //in setup method  
      minim = new Minim(this);    //in the setup method
  song = minim.loadFile("awesometrack.mp3", 512);   //in the setup method
 
  }
       void draw(){
       if(mousePressed){ rotateImage(pictureOfRecord, angle);
         image(pictureOfRecord, 0, 0);  //in draw method
        angle= angle +1000;}
      if(mousePressed){
  song.play();
song.pause();
}    
     }
       void rotateImage(PImage image, int amountToRotate) {
        translate(width/2, height/2);
        rotate(amountToRotate*TWO_PI/360);
        translate(-image.width/2, -image.height/2);
    }
