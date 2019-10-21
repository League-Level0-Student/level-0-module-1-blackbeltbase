void setup(){
  size(100,100);
background(#F700F4);
}

void draw()
{
  int xPos = 10;
  int yPos = 10;
  for(int i = 0; i<=3; i ++ )
  {
   text("ice cream", xPos, yPos); 
   yPos += 10;
  }
  text("banana", 50, 80);
}
