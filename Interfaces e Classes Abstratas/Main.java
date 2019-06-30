public class Main{
    public static void main (String[] args){
        Movable m1 = new MovablePoint(5, 6, 10, 15); 
        System.out.println(m1.toString());
        m1.moveLeft();
        System.out.println(m1);
        
        Movable m2 = new MovableCircle(1, 2, 3, 4, 20);  
        System.out.println(m2.toString());
        m2.moveRight();
        System.out.println(m2);

        Movable m3 = new MovableRectangle(1, 2, 3, 4, 7, 4);  
        System.out.println(m3);
        m3.moveRight();
        System.out.println(m3);

    }
}