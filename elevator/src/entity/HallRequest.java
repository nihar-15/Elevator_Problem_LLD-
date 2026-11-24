package entity ;

import enums.Direction; 
import interfaces.Request;


public class HallRequest implements Request{
   int floor ;
   Direction d;

    public HallRequest(int floor , Direction direction) {
                this.floor = floor;
                this.d = direction;
    }
    
    @Override 
    public int getFloor(){
        return floor;
    }
}