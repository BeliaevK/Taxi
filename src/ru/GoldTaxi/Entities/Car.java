package ru.GoldTaxi.Entities;

/**
 * Created by Scala on 30.10.2016.
 */
public class Car {
    private String carMark;
    private Driver carDriver;
    private String carNumber;
    private boolean babySeat;
    private boolean smoking;
    private int carClass;
    private static final int TYPE_OF_CLASS_ECONOMIC = 0;
    private static final int TYPE_OF_CLASS_BUSYNESS = 1;
    private boolean carStatus;

    public static int getTypeOfClassEconomic() {
        return TYPE_OF_CLASS_ECONOMIC;
    }

    public static int getTypeOfClassBusyness() {
        return TYPE_OF_CLASS_BUSYNESS;
    }

    public String getCarMark() {
        return carMark;
    }

    public void setCarMark(String carMark) {
        this.carMark = carMark;
    }

    public Driver getCarDriver() {
        return carDriver;
    }

    public void setCarDriver(Driver carDriver) {
        this.carDriver = carDriver;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public boolean isBabySeat() {
        return babySeat;
    }

    public void setBabySeat(boolean babySeat) {
        this.babySeat = babySeat;
    }

    public boolean isSmoking() {
        return smoking;
    }

    public void setSmoking(boolean smoking) {
        this.smoking = smoking;
    }

    public int getCarClass() {
        return carClass;
    }

    public void setCarClass(int carClass) {
        this.carClass = carClass;
    }

    public boolean isCarStatus() {
        return carStatus;
    }

    public void setCarStatus(boolean carStatus) {
        this.carStatus = carStatus;
    }
}
