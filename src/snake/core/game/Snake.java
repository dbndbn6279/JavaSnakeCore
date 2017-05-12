package snake.core.game;

import java.util.ArrayList;

public class Snake {
	//Typedef:
	private enum Direction {
		UP, DOWN, LEFT, RIGHT
	}
	
	//Snake:
	private ArrayList<Position> body;
	private Direction direction;
	private Position lastTail;
	
	//Constructor:
	public Snake(){
		body = new ArrayList<Position>();
		for(int i = 0; i < 3; i ++){
			this.body.add(new Position(0, i));
		}
		this.direction = Direction.RIGHT;
	}
	
	public Snake(int bodyLength){
		body = new ArrayList<Position>();
		for(int i = 0; i < bodyLength; i++){
			body.add(new Position(i, 0));
		}
		direction = Direction.RIGHT;
	}
	
	private Position GetHead() {
		return body.get(body.size() - 1) ;
	}
	
	private Position GetTail() {
		return body.get(0);
	}
	
	private void RememberTail() {
		int x = GetTail().getX();
		int y = GetTail().getY();
		lastTail = new Position(x, y);
	}
	
	//Method:
	public void Move(){
		//Determine next step:
		Position pos = new Position();
		if(direction == Direction.UP){
			//Move UP
			pos.setX(this.GetHead().getX());
			pos.setY(this.GetHead().getY() - 1);
			
		}else if(direction == Direction.DOWN){
			//Move Down
			pos.setX(this.GetHead().getX());
			pos.setY(this.GetHead().getY() + 1);
			
		}else if(direction == Direction.LEFT){
			//Move Left
			pos.setX(this.GetHead().getX() - 1);
			pos.setY(this.GetHead().getY());
			
		}else if(direction == Direction.RIGHT){
			//Move Right
			pos.setX(this.GetHead().getX() + 1);
			pos.setY(this.GetHead().getY());
		}
		
		//Move to next grid
		body.add(pos);
		RememberTail();
		body.remove(0);
	}
	
	public void Grow(){
		body.add(0, lastTail);
	}
	
	//For Debugging:
	public void d_DisplaySnakePosition(){
		for(int i = 0; i < body.size(); i++){
			StringBuilder builder = new StringBuilder();
			builder.append("[");
			builder.append(body.get(i).getX());
			builder.append(", ");
			builder.append(body.get(i).getY());
			builder.append("]");
			
			String result = builder.toString();
			System.out.println(result);
		}
		System.out.println();
	}
	
}
