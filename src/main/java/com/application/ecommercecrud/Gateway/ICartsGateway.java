package com.application.ecommercecrud.Gateway;

import java.io.IOException;
import java.util.List;

import com.application.ecommercecrud.dto.CartsDTO;

public interface ICartsGateway {
    List<CartsDTO> getAllCarts() throws IOException;
}
