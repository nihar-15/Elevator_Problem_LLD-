package services;

import java.util.ArrayList;
import java.util.List;

import entity.ElevatorController;
import interfaces.ElevatorAllocator;
import interfaces.Request;

public class NearestElevatorAllocator implements ElevatorAllocator {

    List<ElevatorController> controllers = new ArrayList<>();
    
    @Override 
    public ElevatorController allocate(Request request){
        int floor = request.getFloor();
        int nearestElevatorId = 1000 ;
        ElevatorController controller = controllers.get(0);
        for(ElevatorController ele : controllers){
                if(Math.abs(ele.getFloor() - floor) < nearestElevatorId){
                    nearestElevatorId = ele.getElevatorId();
                    controller = ele;
                }
        }
     return controller;
    }
}
