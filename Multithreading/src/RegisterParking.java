public class RegisterParking {
    private static int count = 0;
    private final int parkingId;

    public RegisterParking() {
        this.parkingId = ++count;
    }

    public int getParkingId() {
        return parkingId;
    }
}