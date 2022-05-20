package com.company;

public class CellPhone extends Product{
    int memory;
    double screenSize;
    int batteryPower;
    int ram;
    String color;
    public CellPhone(double price, double discountRate, int stock, String name, String brand, int memory,
                     double screenSize, int batteryPower, int ram, String color) {
        super(price, discountRate, stock, name, brand);
        this.memory = memory;
        this.screenSize = screenSize;
        this.batteryPower = batteryPower;
        this.ram = ram;
        this.color = color;
    }
    public int getMemory() {
        return memory;
    }
    public void setMemory(int memory) {
        this.memory = memory;
    }
    public double getScreenSize() {
        return screenSize;
    }
    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }
    public int getBatteryPower() {
        return batteryPower;
    }
    public void setBatteryPower(int batteryPower) {
        this.batteryPower = batteryPower;
    }
    public int getRam() {
        return ram;
    }
    public void setRam(int ram) {
        this.ram = ram;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
}
