package demo.gke.ecom.devliveryservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/delivery")
public class DeliveryController {

    @PostMapping("/calculateDeliveryCost")
    public ResponseEntity<DeliveryCost> calculateDeliveryCost(@RequestBody DeliveryRequest deliveryRequest) {
        // Calculate delivery cost
        DeliveryCost deliveryCost = new DeliveryCost();
        return ResponseEntity.ok().body(deliveryCost);
    }


    @GetMapping("/test")
    public ResponseEntity<String> testMethod() {
        return ResponseEntity.ok().body("Delivery-service");
    }


}
