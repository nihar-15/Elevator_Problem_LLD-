package entity;

import java.util.TreeSet;


public class ElevatorController {
    Elevator elevator ; 
    TreeSet<Integer> upwardRequests = new TreeSet<>();
    TreeSet<Integer> downwardRequests = new TreeSet<>();

    public ElevatorController(Elevator e) {
        this.elevator = e;
    }
      
    public int getFloor(){
        return elevator.getFloor();
    }
    
    public int getElevatorId(){
        return this.elevator.getId();
    }
}
