public class MovablePoint implements Movable{
    protected int x;
    protected int y;
    protected int xSpeed;
    protected int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;  
    }

    public String toString(){
        return "O x no ponto "+this.x+" , o y no ponto "+this.y+". A velocidade de x está em "+this.xSpeed+" e a de y está em "+ this.ySpeed+".";
    }
    public void moveUp(){
        y+=1;
    }
    public void moveDown(){
        y-=1;
    }
    public void moveLeft(){
        x-=1;
    }
    public void moveRight(){
        x+=1;
    }


}