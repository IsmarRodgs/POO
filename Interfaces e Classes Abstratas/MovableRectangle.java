public class MovableRectangle implements Movable{
    private MovablePoint point_up_left;
    private MovablePoint point_down_right;

    public MovableRectangle (int x, int y, int xSpeed, int ySpeed, int altura, int comprimento){
        this.point_up_left = new MovablePoint (x, y+altura, xSpeed, ySpeed);
        this.point_down_right = new MovablePoint (x+comprimento, y, xSpeed, ySpeed);
    }
    public String toString(){
        return "Type: Rectangle. "+point_up_left.toString() +"\n                 "+ point_down_right.toString();
    }
    public void moveUp(){
        point_up_left.moveUp();
        point_down_right.moveUp();
    }
    public void moveDown(){
        point_up_left.moveDown();
        point_down_right.moveDown();
    }
    public void moveLeft(){
        point_up_left.moveLeft();
        point_down_right.moveLeft();
    }
    public void moveRight(){
        point_up_left.moveRight();
        point_down_right.moveRight();
    }

}