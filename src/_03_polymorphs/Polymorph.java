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
    
    public void update(Polymorph m) {
		y=y+1;
		x=x+1;
		if(x>250&&y>250) {
			for(int i=250; i>30; i--) {
				
			
			x=x-1;
			y=y-1;
			}
		}
		
	}
    public void update2(Polymorph m) {
    	x=x+1;
    	if(x>400) {
    		y=y+1;
    		if(y>400) {
    			x=x-1;
    			if(x<100) {
    				y=y-1;
    				
    			}
    		}
    	}
    }

 
    public abstract void draw(Graphics g);
}
