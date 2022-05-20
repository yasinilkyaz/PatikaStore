package com.company;

public class Notebook extends Product{
    int ram;
    int storage;
    double screenSize;
    public Notebook(double price, double discountRate, int stock, String name, String brand, int ram,
                    int storage, double screenSize) {
        super(price, discountRate, stock, name, brand);
        this.ram = ram;
        this.storage = storage;
        this.screenSize = screenSize;
    }
    public int getRam() {
        return ram;
    }
    public void setRam(int ram) {
        this.ram = ram;
    }
    public int getStorage() {
        return storage;
    }
    public void setStorage(int storage) {
        this.storage = storage;
    }
    public double getScreenSize() {
        return screenSize;
    }
    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }
}
