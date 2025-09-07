package com.example.boot303_ssm.POJO;

public class Car {
    private Long id;
    private String car_number;
    private String brand;
    private String guide_price;
    private String product_time;
    private String cartype;

    public Car() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCar_number() {
        return car_number;
    }

    public void setCar_number(String car_number) {
        this.car_number = car_number;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getGuide_price() {
        return guide_price;
    }

    public void setGuide_price(String guide_price) {
        this.guide_price = guide_price;
    }

    public String getProduct_time() {
        return product_time;
    }

    public void setProduct_time(String product_time) {
        this.product_time = product_time;
    }

    public String getCartype() {
        return cartype;
    }

    public void setCartype(String cartype) {
        this.cartype = cartype;
    }

    public Car(Long id, String car_number, String brand, String guide_price, String product_time, String cartype) {
        this.id = id;
        this.car_number = car_number;
        this.brand = brand;
        this.guide_price = guide_price;
        this.product_time = product_time;
        this.cartype = cartype;
    }
}
