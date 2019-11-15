package Program.ParkingLot;

import java.util.ArrayList;

public class DistanceManager {

    // Property
    private static DistanceManager singleInstance = null;
    private static ArrayList<DistanceLotToLot> distances = new ArrayList<>();

    private DistanceManager(){
    //create distance
        DistanceLotToLot distance1  = new DistanceLotToLot(ParkingLotLocation.MainLot, ParkingLotLocation.LotA, 125);
        DistanceLotToLot distance2  = new DistanceLotToLot(ParkingLotLocation.MainLot, ParkingLotLocation.LotB, 100);
        DistanceLotToLot distance3  = new DistanceLotToLot(ParkingLotLocation.MainLot, ParkingLotLocation.LotC, 300);
        DistanceLotToLot distance4  = new DistanceLotToLot(ParkingLotLocation.MainLot, ParkingLotLocation.LotD, 200);
        DistanceLotToLot distance5  = new DistanceLotToLot(ParkingLotLocation.MainLot, ParkingLotLocation.LotE, 220);
        DistanceLotToLot distance6  = new DistanceLotToLot(ParkingLotLocation.MainLot, ParkingLotLocation.LotF, 170);
        DistanceLotToLot distance7  = new DistanceLotToLot(ParkingLotLocation.LotA, ParkingLotLocation.LotB, 50);
        DistanceLotToLot distance8  = new DistanceLotToLot(ParkingLotLocation.LotA, ParkingLotLocation.LotC, 100);
        DistanceLotToLot distance9  = new DistanceLotToLot(ParkingLotLocation.LotA, ParkingLotLocation.LotD, 200);
        DistanceLotToLot distance10 = new DistanceLotToLot(ParkingLotLocation.LotA, ParkingLotLocation.LotE, 300);
        DistanceLotToLot distance11 = new DistanceLotToLot(ParkingLotLocation.LotA, ParkingLotLocation.LotF, 400);
        DistanceLotToLot distance12 = new DistanceLotToLot(ParkingLotLocation.LotB, ParkingLotLocation.LotC, 70);
        DistanceLotToLot distance13 = new DistanceLotToLot(ParkingLotLocation.LotB, ParkingLotLocation.LotD, 100);
        DistanceLotToLot distance14 = new DistanceLotToLot(ParkingLotLocation.LotB, ParkingLotLocation.LotE, 250);
        DistanceLotToLot distance15 = new DistanceLotToLot(ParkingLotLocation.LotB, ParkingLotLocation.LotF, 300);
        DistanceLotToLot distance16 = new DistanceLotToLot(ParkingLotLocation.LotC, ParkingLotLocation.LotD, 125);
        DistanceLotToLot distance17 = new DistanceLotToLot(ParkingLotLocation.LotC, ParkingLotLocation.LotE, 150);
        DistanceLotToLot distance18 = new DistanceLotToLot(ParkingLotLocation.LotC, ParkingLotLocation.LotF, 220);
        DistanceLotToLot distance19 = new DistanceLotToLot(ParkingLotLocation.LotD, ParkingLotLocation.LotE, 130);
        DistanceLotToLot distance20 = new DistanceLotToLot(ParkingLotLocation.LotD, ParkingLotLocation.LotF, 140);
        DistanceLotToLot distance21 = new DistanceLotToLot(ParkingLotLocation.LotE, ParkingLotLocation.LotF, 160);

    //push distance to list
        distances.add(distance1);
        distances.add(distance2);
        distances.add(distance3);
        distances.add(distance4);
        distances.add(distance5);
        distances.add(distance6);
        distances.add(distance7);
        distances.add(distance8);
        distances.add(distance9);
        distances.add(distance10);
        distances.add(distance11);
        distances.add(distance12);
        distances.add(distance13);
        distances.add(distance14);
        distances.add(distance15);
        distances.add(distance16);
        distances.add(distance17);
        distances.add(distance18);
        distances.add(distance19);
        distances.add(distance20);
        distances.add(distance21);
    }

    public static DistanceManager getDistanceManager(){
        if (singleInstance == null){
            singleInstance = new DistanceManager();
        }
        return singleInstance;
    }

    public static ArrayList<DistanceLotToLot> getDistances(){
        return distances;
    }
    public static int getDistanceFromStartToEnd (ParkingLotLocation iStart, ParkingLotLocation iEnd) {
        for (int i = 0; i < distances.size(); i++) {
            DistanceLotToLot distanceLotToLot = distances.get(i);

        }
    return getDistanceFromStartToEnd(ParkingLotLocation.LotA, ParkingLotLocation.LotB);

    }
}
