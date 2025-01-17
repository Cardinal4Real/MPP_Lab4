package org.miu.lab3.prob2;

import java.util.ArrayList;
import java.util.List;

public class Building {
    private double maintenanceCost;
    private List<Apartment> apartments;

    public Building(double maintenanceCost, double amount) {
        this.maintenanceCost = maintenanceCost;
        apartments = new ArrayList<Apartment>();
    }

    public void addApartment(double rent) {
        apartments.add(new Apartment(rent));
    }
    public void addApartment(Apartment apartment) {
        apartments.add(apartment);
    }
    public final double calcProfits(){
        double sum = 0;
        for (Apartment apartment : apartments) {
           sum+=apartment.calcProfits();
        }
        return sum-maintenanceCost;
    }
}
