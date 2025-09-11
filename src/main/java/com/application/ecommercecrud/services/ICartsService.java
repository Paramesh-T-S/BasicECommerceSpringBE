package com.application.ecommercecrud.services;

import java.io.IOException;
import java.util.List;

import com.application.ecommercecrud.dto.CartsDTO;

public interface ICartsService {

    List<CartsDTO> getAllCarts() throws IOException;

}
