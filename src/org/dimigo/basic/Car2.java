package org.dimigo.basic;

public class Car2 {
    private String company;
    private String model;
    private String color;
    private int maxSpeed;
    private int price;

    public Car2() {
    }

    public Car2(String company, String model, String color, int maxSpeed, int price) {
        this.company = company;
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.price = price;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if(maxSpeed > 0){
            this.maxSpeed = maxSpeed;
        }
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if(price >= 0){
            this.price = price;
        }

    }

    public void printCarInfo(Car2 car){
        System.out.println("제조사명 : "+car.company);
        System.out.println("모델명 : "+car.model);
        System.out.println("색상 : "+car.color);
        System.out.println("최대속도 : "+car.maxSpeed+"km");
        System.out.printf("가격 : %,d원\n",car.price);
    }
}
