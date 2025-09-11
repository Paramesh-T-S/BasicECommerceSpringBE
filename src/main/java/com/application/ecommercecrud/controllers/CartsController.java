package com.application.ecommercecrud.controllers;

import java.io.IOException;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.application.ecommercecrud.dto.CartsDTO;
import com.application.ecommercecrud.services.ICartsService;

@RestController
@RequestMapping("/api/carts")
public class CartsController {

    ICartsService cartsService;

    public CartsController(ICartsService cartsService) {
        this.cartsService = cartsService;
    }

    @GetMapping("all")
    public List<CartsDTO> getAllCarts() throws IOException {
        return this.cartsService.getAllCarts();
    }

}
