package L06;

import java.util.ArrayList;

public class Train {
    private ArrayList<Carriage> carriages = new ArrayList<>();

    public void AddCarriage(Carriage carriage){
        carriages.add(carriage);
    }

    public double getTotalCapacity(){
        double sum =0;
        for(Carriage c : carriages){
            sum += c.getCapacity();
        }
        return sum;
    }

    public double getAverageCapacity(){
        if(carriages.isEmpty()){
            return 0;
        }
        return getTotalCapacity()/ carriages.size();
    }
}
