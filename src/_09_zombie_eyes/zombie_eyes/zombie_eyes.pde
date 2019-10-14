
void setup() {
size(400, 200);
PImage face  = loadImage("download.jpeg");
image(face, 0, 0);
}
void draw() {
  fill(mouseX, mouseY, 50);
ellipse(120, 80, 30, 30);
ellipse(175, 80, 30, 30);
fill(#030303);
ellipse(120, 80, 10, 10);
ellipse(175, 80, 10, 10);
}
