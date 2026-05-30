package main.lesson6.delivery.service;

import main.lesson6.delivery.model.Parcel;

public class DeliveryService {

    public void send(Parcel parcel) {
        System.out.println("Sending parcel...");
        parcel.printInfo();
        System.out.println("====================");
        System.out.println();
    }

}
