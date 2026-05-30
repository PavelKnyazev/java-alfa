package main.lesson6.delivery.model;

// Посылка
public class Parcel {
    private String receiverName; // имя получателя
    private String deliveryAddress; // адрес доставки
    protected double weight; // вес посылки
    String trackingNumber;

    Parcel() {
    }

    public Parcel(String receiverName, String deliveryAddress, double weight, String trackingNumber) {
        this.receiverName = receiverName;
        this.deliveryAddress = deliveryAddress;
        this.weight = weight;
        this.trackingNumber = trackingNumber;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public double getWeight() {
        return weight;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double calculateDeliveryPrice() {
        return 100 + weight * 30;
    }

    public void printInfo() {
        System.out.println("Recipient's name: " + receiverName);
        System.out.println("Delivery address: " + deliveryAddress);
        System.out.println("Parcel weight: " + weight);
        System.out.println("Tracking number: " + trackingNumber);
    }
}
