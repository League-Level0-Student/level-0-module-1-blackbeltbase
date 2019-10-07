void setup() {
    size(500, 500);
}
void draw() {
  fill(#C9C3C3);
    background(200, 200, 200);
    noStroke();
    fill(#FF0307);
    ellipse(150, 200, 150, 150);
    fill(#FF0307);
    ellipse(212, 200, 150, 150);
    fill(#03FF47);
    rect(176, 103, 12, 32);
    if(mousePressed){
      fill(#C9C3C3);
    ellipse(270, 200, 50, 50);
    ellipse(270, 220, 50, 50);
    }
}
