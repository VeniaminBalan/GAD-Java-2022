package DesignPatterns.Challanges.ch3;

import java.util.ArrayList;
import java.util.List;

public class RealEstateAgentProxy {
    List<Apartment> apartmentList;

    public RealEstateAgentProxy(){
        this.apartmentList = new ArrayList<>();
    }

    public void represent(Apartment appartment){
        this.apartmentList.add(appartment);
    }

    Apartment rent(Student student){
        if(student.getName().trim().startsWith("P")) return null;

        Apartment apart = null;

        for (var app: apartmentList){
            if(student.getMoney() >= app.getMonthlyRentCost() ){
                apart = app;
                break;
            }
        }

        for (var app: apartmentList){
            if(apart.getMonthlyRentCost() >= app.getMonthlyRentCost() ){
                apart = app;
                break;
            }
        }

        return apart;
    }
}
