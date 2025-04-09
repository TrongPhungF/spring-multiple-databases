package com.org.multipledatabases.controller;

import com.org.multipledatabases.oracle.entity.Shipping;
import com.org.multipledatabases.oracle.repository.ShippingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ShippingController {

    private final ShippingRepository shippingRepository;

    @GetMapping("/api/v1/shippings")
    public ResponseEntity<List<Shipping>> getAllShipping() {
        return new ResponseEntity<>(shippingRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping("/api/v1/shippings")
    public void saveShipping(@RequestBody Shipping shipping) {
        shippingRepository.save(shipping);
    }
}
