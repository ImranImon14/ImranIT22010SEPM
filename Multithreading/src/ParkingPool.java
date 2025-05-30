import java.util.LinkedList;
import java.util.Queue;

public class ParkingPool {
    private final Queue<RegisterParking> parkingQueue = new LinkedList<>();

    public synchronized void addParkingRequest(RegisterParking parking) {
        parkingQueue.add(parking);
        System.out.println("New Parking Request Registered: ID " + parking.getParkingId());
        notify(); // Wake up a waiting agent
    }

    public synchronized RegisterParking getParkingRequest() {
        while (parkingQueue.isEmpty()) {
            try {
                wait(); // Wait if no requests
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return null;
            }
        }
        return parkingQueue.poll();
    }
}