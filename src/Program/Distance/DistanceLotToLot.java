package Program.Distance;

import Program.ParkingLot.ParkingLotLocation;

public class DistanceLotToLot {

    private ParkingLotLocation start;
    private ParkingLotLocation end;
    private int distance;

    public DistanceLotToLot(ParkingLotLocation iStart, ParkingLotLocation iEnd, int iDistance) {
        this.start = iStart;
        this.end = iEnd;
        this.distance = iDistance;
    }

    public ParkingLotLocation getStart() {
        return start;
    }

    public void setStart(ParkingLotLocation start) {
        this.start = start;
    }

    public ParkingLotLocation getEnd() {
        return end;
    }

    public void setEnd(ParkingLotLocation end) {
        this.end = end;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
}
