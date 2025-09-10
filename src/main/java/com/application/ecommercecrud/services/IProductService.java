package com.application.ecommercecrud.services;

import java.io.IOException;
import java.util.List;

import com.application.ecommercecrud.dto.ProductsDTO;

public interface IProductService {
    List<ProductsDTO> getAllProducts() throws IOException;
}
