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
        return "O x esta "+this.x+" , o y "+this.y+".A velocidade de x esta "+this.xSpeed+" e a de y esta"+ this.ySpeed+".";
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