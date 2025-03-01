package demo.gke.ecom.deliveryservice.controller;

import lombok.Data;

@Data
public class DeliveryCost {

    private double recomndedPrice;
    private double minPrice;
    private double maxPrice;

}
