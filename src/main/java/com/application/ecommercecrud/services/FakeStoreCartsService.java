package com.application.ecommercecrud.services;

import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Service;

import com.application.ecommercecrud.Gateway.ICartsGateway;
import com.application.ecommercecrud.dto.CartsDTO;

@Service
public class FakeStoreCartsService implements ICartsService {

    ICartsGateway cartsgateway;

    public FakeStoreCartsService(ICartsGateway cartsgateway) {
        this.cartsgateway = cartsgateway;
    }

    @Override
    public List<CartsDTO> getAllCarts() throws IOException {
        return this.cartsgateway.getAllCarts();
    }

}
