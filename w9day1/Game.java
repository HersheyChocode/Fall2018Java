package w9day1;
import apcs.*;
public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Window.size(600, 700);	          
	     
	      Bird bird = new Bird();

//	      We're going to make 3 pipes and simply reuse them. 
	      int score = 0;
	      Pipe pipe1 = new Pipe(300);
	      Pipe pipe2 = new Pipe(pipe1.startVal+pipe1.gap);
	      Pipe pipe3 = new Pipe(pipe2.startVal+pipe1.gap); 
	      bird.draw();
          pipe1.draw();
          pipe2.draw();          
          pipe3.draw();
	      while(true) {
	          Window.frame();
	          Window.out.background("light pink");
	          Window.out.color("black");
        	  Window.out.print(score, Window.width()/2, 20);//Prints score
        	  Window.out.color("blue");
	          bird.draw();
	          pipe1.draw();
	          pipe2.draw();
	          pipe3.draw();
	          bird.move("space");
	          pipe1.move();
	          pipe2.move();
	          pipe3.move();         
	          // checks if our bird is hitting any of the pipes 
	          if(bird.makeContact(pipe1)) {
	        	  break;
	        	  } else if (bird.makeContact(pipe2)){
	        	  break;
	          } else if (bird.makeContact(pipe3)) {
	        	  break;
	          } else if (bird.y >Window.height()) {
	        	  System.out.println("past height");
	        	  break;
	          } else if (bird.x<=pipe1.x+20+pipe1.width/2&&bird.x>pipe1.x+pipe1.width/2){
	        	  score+=1;
	          }
	          
	          }
	      }

	  /*public static void drawBackground(){
		  Window.out.background("pink");
	  }*/

	}