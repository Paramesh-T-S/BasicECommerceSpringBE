package com.application.ecommercecrud.Gateway;

import java.io.IOException;
import java.util.List;

import com.application.ecommercecrud.dto.ProductsDTO;

public interface IProductgateway {

    List<ProductsDTO> getAllProducts() throws IOException;
}
