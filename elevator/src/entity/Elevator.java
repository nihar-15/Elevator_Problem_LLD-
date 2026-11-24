package entity ;

import enums.ElevatorStatus;

public class Elevator {

    private static final System.Logger LOG = System.getLogger(Elevator.class.getName());
    int id;
    int floor ; 
    ElevatorStatus status;

    public Elevator(int id, int floor, ElevatorStatus status) {
        this.id = id;
        this.floor = floor;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public int getFloor() {
        return floor;
    }

    public ElevatorStatus getStatus() {
        return status;
    }

    
}
