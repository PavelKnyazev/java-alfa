package main.lesson6.delivery.app;

import main.lesson6.delivery.model.ExpressParcel;
import main.lesson6.delivery.model.FragileParcel;
import main.lesson6.delivery.model.Parcel;
import main.lesson6.delivery.service.DeliveryService;

public class Main {
    public static void main(String[] args) {

        DeliveryService deliveryService = new DeliveryService();

        Parcel parcel = new Parcel(
                "Ivanov Ivan",
                "Moscow, Tverskaya 1",
                2.5,
                "TRACK-001"
        );

        FragileParcel fragileParcel = new FragileParcel(
                "Petr Petrov",
                "Moscow, Arbat 10",
                1.7,
                "TRACK-002",
                true
        );

        ExpressParcel expressParcel = new ExpressParcel(
                "Anna Smirnova",
                "Moscow, Lenina 5",
                3.0,
                "TRACK-003",
                12
        );

        DeliveryService service = new DeliveryService();
        service.send(parcel);
        service.send(fragileParcel);
        service.send(expressParcel);
    }
}
