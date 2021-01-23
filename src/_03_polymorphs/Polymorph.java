package _03_polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
    int x;
    int y;
    int width;
    int height;
	public int getNumber() {
        return this.x;
    }
 
    public void setNumber(int num) {
        this.x = num;
    }
    Polymorph(int x, int y){
   	 this.x = x;
   	 this.y = y;
    }
    
    public void update(){
   	 
    }
    
    public abstract void draw(Graphics g);
}
