package main.lesson6.delivery.model;

// Хрупкие посылки
public class FragileParcel extends Parcel {

    private boolean requiresCarefulHandling;

    public FragileParcel(String receiverName, String deliveryAddress, double weight, String trackingNumber, boolean requiresCarefulHandling) {

        super(receiverName,
                deliveryAddress,
                weight,
                trackingNumber);

        this.requiresCarefulHandling = requiresCarefulHandling;
    }

    @Override
    public double calculateDeliveryPrice() {
        return super.calculateDeliveryPrice() + 200;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Handle with care: " + requiresCarefulHandling);
    }
}
