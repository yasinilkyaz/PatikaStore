package com.company;

public class Brand implements Comparable<Brand>{
    int id;
    String name;
    public Brand(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public int compareTo(Brand Markalar) {
        // TODO Auto-generated method stub
        return (this.getName().compareTo(Markalar.getName()));
    }
}
