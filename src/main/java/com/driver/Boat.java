package com.driver;

public class Boat implements WaterVehicle{
    private String name;
    private int capactiy;

    public Boat(String name, int capactiy) {
        this.name = name;
        this.capactiy = capactiy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapactiy() {
        return capactiy;
    }

    public void setCapactiy(int capactiy) {
        this.capactiy = capactiy;
    }

    @Override
    public String getVehicleName() {
        return null;
    }

    @Override
    public int getVehicleCapacity() {
        return 0;
    }
}
