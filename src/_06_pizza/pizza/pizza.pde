  import ddf.minim.*;     //at the top of the sketch
Minim minim;     //at the top of the sketch
AudioPlayer sound; 
void setup() {
    size(500, 500);
      fill(#766C17);
  ellipse(250, 250, 500, 500);
  fill(#FF0A12);
  ellipse(250, 250, 480,480);
  fill(#FEFF0A);
  ellipse(250, 250, 460, 460);
  minim = new Minim(this);      //in the setup method
sound = minim.loadFile("484344__inspectorj__bike-bell-ding-single-01-01.wav");      //in the setup method

}
void draw() {
  if(mousePressed){
  PImage pepperoni = loadImage("pepperoni-slices.png");
    pepperoni.resize(30,30);
  image(pepperoni,mouseX, mouseY);
  sound.play();
sound.rewind();
  
  }


}
