package snake.core.game;

public class Food {
	
	private Position position;
	
	public Food(){
		position = new Position(10, 10);
	}
	
	public Food(int x, int y){
		position = new Position(x, y);
	}
	
	public void GenerateFood(){	
		position = new Position(); //Need to be modified;
	}
}
