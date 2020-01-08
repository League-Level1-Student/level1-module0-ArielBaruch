
PImage pictureOfRecord;                        //as member variable
        void setup(){
        size(600,600);                                 //in setup method
        pictureOfRecord= loadImage("record.png");      //in setup method
      pictureOfRecord.resize(600,600);     //in setup method  
      }
       void draw(){
        image(pictureOfRecord, xPosition, yPosition);  //in draw method
       }
       void rotateImage(PImage image, int amountToRotate) {
        translate(width/2, height/2);
        rotate(amountToRotate*TWO_PI/360);
        translate(-image.width/2, -image.height/2);
    }
