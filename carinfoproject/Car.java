/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carinfoproject;

import java.io.Serializable;

/**
 *
 * @author mac
 */
public class Car implements Serializable{
        private int  carMaxPrice,carMinPrice;
        private String carType,carId,carMake,carModel,carStyle,carDriveType,carSizeEngine,manufacuringYear;

    public Car(String carId ,String carType, String carMake, String carModel, int carMinPrice, int carMaxPrice , String carStyle, String carDriveType,String manufacuringYear, String carSizeEngine) {
        this.carId = carId;
        this.carType = carType;
        this.carMake = carMake;
        this.carModel = carModel;
        this.carMinPrice = carMinPrice;
        this.carMaxPrice = carMaxPrice;
        this.carStyle = carStyle;
        this.carDriveType = carDriveType;
        this.manufacuringYear = manufacuringYear;
        this.carSizeEngine = carSizeEngine;
    }

    public Car() {
    }
    

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public String getManufacuringYear() {
        return manufacuringYear;
    }

    public void setManufacuringYear(String manufacuringYear) {
        this.manufacuringYear = manufacuringYear;
    }

    public int getCarMaxPrice() {
        return carMaxPrice;
    }

    public void setCarMaxPrice(int carMaxPrice) {
        this.carMaxPrice = carMaxPrice;
    }

    public int getCarMinPrice() {
        return carMinPrice;
    }

    public void setCarMinPrice(int carMinPrice) {
        this.carMinPrice = carMinPrice;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getCarMake() {
        return carMake;
    }

    public void setCarMake(String carMake) {
        this.carMake = carMake;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarStyle() {
        return carStyle;
    }

    public void setCarStyle(String carStyle) {
        this.carStyle = carStyle;
    }

    public String getCarDriveType() {
        return carDriveType;
    }

    public void setCarDriveType(String carDrive) {
        this.carDriveType = carDrive;
    }

    public String getCarSizeEngine() {
        return carSizeEngine;
    }

    public void setCarSizeEngine(String carSizeEngine) {
        this.carSizeEngine = carSizeEngine;
    }

    @Override
    public String toString() {
        return "Car : " + "manufacuringYear = " + manufacuringYear + ", carMaxPrice = " + carMaxPrice + ", carMinPrice = " + carMinPrice + ", carType = " + carType + ", carId = " + carId + ", carMake = " + carMake + ", carModel = " + carModel + ", carStyle = " + carStyle + ", carDrive = " + carDriveType + ", carSizeEngine = " + carSizeEngine ;
    }
    
}
