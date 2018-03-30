package br.com.plymorphism;

public class SnakeHandler {
	private Snake snake;
	public void setSnake(Snake snake) { this.snake = snake; }
	public void setSnake2(Snake2 snake) { this.snake = snake; }
	public static void main(String[] args) {
	new SnakeHandler().setSnake( new Snake());
	new SnakeHandler().setSnake( new Snake2());
	new SnakeHandler().setSnake( new Object());// is not correct pass a superclass only a subclass
	new SnakeHandler().setSnake(null);
	
	new SnakeHandler().setSnake2( new Snake()); // is not correct pass a superclass only a subclass
	}
}
class Snake{
	
}
class Snake2 extends Snake{
	
}

