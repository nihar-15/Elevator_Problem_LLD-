package entity ;

import interfaces.Request;

public class CarRequest implements Request{
    int floor ;

    public CarRequest(int f ) {
        this.floor = f ;
    }
 
     @Override 
    public int getFloor(){
        return floor;
    }
    
}