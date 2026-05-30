package main.lesson6.delivery.model;

// Быстрые посылки
public class ExpressParcel extends Parcel {

    private int deliveryHours;

    public ExpressParcel(String receiverName, String deliveryAddress, double weight, String trackingNumber, int deliveryHours) {
        super(receiverName,
                deliveryAddress,
                weight,
                trackingNumber);

        this.deliveryHours = deliveryHours;
    }

    @Override
    public double calculateDeliveryPrice() {
        if (deliveryHours < 24) {
            return super.calculateDeliveryPrice() + 500;
        }
        return super.calculateDeliveryPrice();
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Delivery hours: " + deliveryHours);
    }
}
