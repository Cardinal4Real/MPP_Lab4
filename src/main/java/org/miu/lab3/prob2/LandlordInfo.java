package org.miu.lab3.prob2;

import java.util.ArrayList;
import java.util.List;

public class LandlordInfo {
    private List<Building> buildings;

    public LandlordInfo() {
        buildings=new ArrayList<Building>();
    }

    public final double calcProfits(){
        double totalProfit=0;
        for(Building building:buildings){
            totalProfit+=building.calcProfits();
        }
        return totalProfit;
    }
    public void addBuilding(Building building){
        if(building!=null){
            buildings.add(building);
        }
    }
    public void addBuilding(Building[] building){
        for(Building b:building){
            if(b!=null){
                buildings.add(b);
            }
        }

    }
}
