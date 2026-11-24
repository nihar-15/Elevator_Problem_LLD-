package interfaces;

import entity.ElevatorController;

public interface ElevatorAllocator {
    public abstract ElevatorController allocate(Request r);
}
