package snake.core.game;

public class Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Snake snake = new Snake(5);
		snake.d_DisplaySnakePosition();
		
		snake.Move();
		snake.d_DisplaySnakePosition();
		
		snake.Move();
		snake.d_DisplaySnakePosition();
		
		snake.Grow();
		snake.d_DisplaySnakePosition();
	}
}
