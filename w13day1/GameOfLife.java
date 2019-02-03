package w13day1;
import apcs.Window;
public class GameOfLife {
	
	static final int ROWS = 50;
	static final int COLS = 50;
	static int side = 0;
	
	
	public static void main(String[] args) {
		Window.size(500, 500);
		
		
		
		//--------------------------------------------------------------
		//------------------ CELLS SETUP --------------------
		side = Window.width()/ROWS;

		//create a grid
		boolean[][]cells = new boolean [ROWS][COLS];
		
		//running through the grid; initial state of cells
		for(int r = 0; r<ROWS; r++) {
			for(int c = 0; c<COLS; c++) {
				//25% chance of surviving
				
				if(Window.rollDice(25) == 1) {
					cells[c][r]=true;
				} else{
					cells[c][r]=false;
				}
				
			}
		}
		
		
		//--------------------------------------------------------------
		
		
		while(true) {
			Window.frame(200);
			display(cells);
			cells = lifecycle(cells);
		}
		
		
		
	}
	
	public static void display(boolean[][] cells) {
		for(int r = 0; r<ROWS; r++) {
			for(int c = 0; c<COLS; c++) {
				
				if(cells[r][c]) {
					Window.out.randomColor();
					Window.out.square(c * side +  side/2, r*side + side/2, side);
					
					}
				if (Window.mouse.clicked()) {
					int x = Window.mouse.getX();
					int y = Window.mouse.getY();
					Window.out.square(x,y,side);
				}
				}
			}
		
	}


	public static boolean[][]  lifecycle(boolean[][] oldcells) {
		
		//create blank environment
		boolean[][] newcells = new boolean[ROWS][COLS];
		
		
		// count neighbors
		for(int r = 0; r<ROWS; r++) {
			for(int c = 0; c<COLS; c++) {
				int neighbors = 0;
				
				//check the amount of neighbors
				//current cell:   oldcells[r][c]
				// top left
				
				if(r>0 && c>0 && oldcells[r-1][c-1]) {
					neighbors+=1;
				}
				
				// top	
				if(r>0 && oldcells[r-1][c]) {
					neighbors+=1;
				}
				
				// top right
				if(r>0 && c<COLS - 1 && oldcells[r-1][c+1]) {
					neighbors+=1;
				}
				
				// right	
				if(c<COLS - 1 && oldcells[r][c+1]) {
					neighbors+=1;
				}
				
				// bottom right		
				if(r<ROWS-1 && c<COLS-1 && oldcells[r+1][c+1]) {
					neighbors+=1;
				}
				
				// bottom
				if(r<ROWS-1 && oldcells[r+1][c]) {
					neighbors+=1;
				}
				
				// bottom left
				if(r<ROWS-1 && c>0 && oldcells[r+1][c-1]) {
					neighbors+=1;
				}
				
				// left
				if(c>0 && oldcells[r][c-1]) {
					neighbors+=1;
				}
				
				if(oldcells[r][c] && neighbors<2) {
					newcells[r][c]=false;
				}
				
				if(oldcells[r][c] && neighbors==2 || neighbors==3) {
					newcells[r][c]=true;
				}
				
				if(!oldcells[r][c] && neighbors ==3) {
					newcells[r][c]=true;
				}
				
				if(neighbors>3) {
					newcells[r][c]=false;
				}
								
			}
		}
		return newcells;	
	}
	
}