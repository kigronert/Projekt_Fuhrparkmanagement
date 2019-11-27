package Program.ParkingLot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ParkingLotManager {

    private static ParkingLotManager singleInstance = null;
    private static List<ParkingLot> parkingLots = new ArrayList<>();


    public static ParkingLotManager getParkingLotManager(){
        if (singleInstance == null){
            singleInstance = new ParkingLotManager();
        }
        return singleInstance;
    }
    // Constructer
    private ParkingLotManager (){
        //create ParkingLots
        this.createInitialParkingLots();
    }

    private void createInitialParkingLots() {
        List<ParkingLotLocation> parkingLotLocations = Arrays.asList(ParkingLotLocation.values());
        for (int i = 0; i<parkingLotLocations.size(); i++ ){
            parkingLots.add(new ParkingLot(parkingLotLocations.get(i)));
        }
    }

    public List<ParkingLot> getParkingLots() {
        return parkingLots;
    }

    public ParkingLot getParkingLotByLocation(ParkingLotLocation parkingLotLocation){
        ParkingLot result = null;
        for (int i = 0; i < parkingLots.size(); i++) {
            if(parkingLots.get(i).getParkingLotLocation()==parkingLotLocation){
                result = parkingLots.get(i);
                break;
            }
        }
        return result;
    }
}
