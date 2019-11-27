package Program.ParkingLot;

import Program.Spot.SpotLength;

import java.util.HashMap;

public enum ParkingLotLocation {
    MainLot(75,25), LotA (10, 3), LotB (10, 3),
    LotC (10, 3), LotD (25,5), LotE (25, 5), LotF (25,5);

    public int availableShortSpots;
    public int availableLongSpots;

    ParkingLotLocation(int availableShortSpots, int availableLongSpots){
        this.availableShortSpots = availableShortSpots;
        this.availableLongSpots = availableLongSpots;
    }
    public HashMap<SpotLength, Integer> getAvailableSpots (){
        //Integer instead of int, because hashmaps don´t support primitive values
        HashMap<SpotLength, Integer> spots = new HashMap<SpotLength, Integer>();
         spots.put(SpotLength.SHORT, this.availableShortSpots);
         spots.put(SpotLength.LONG, this.availableLongSpots);
        return spots;
    }
}
