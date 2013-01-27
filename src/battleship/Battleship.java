package battleship;

import java.awt.Point;
import java.util.HashMap;

public class Battleship {

 
    public static void main(String[] args) {
      //Hold Ships for each player at a specific point
        HashMap<Point, Ship> pShips = new HashMap<Point, Ship>();
        HashMap<Point, Ship> cShips = new HashMap<Point, Ship>();
        
        //adds 5 random computer ships to the board
        for(int i = 0; i<5; i++){
            int x = (int) Math.random()*9+1;
            int y = (int) Math.random()*9+1;
            cShips.put(new Point(x,y), Ship.randShip(x,y));
        }
    }
}
