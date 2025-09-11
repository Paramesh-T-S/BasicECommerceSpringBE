package com.application.ecommercecrud.Gateway;

import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Component;

import com.application.ecommercecrud.Gateway.api.FakeStoreProductAPI;
import com.application.ecommercecrud.dto.CartsDTO;
import com.application.ecommercecrud.dto.FakeStoreCartsResponseDTO;

@Component
public class FakeStoreCartsGateway implements ICartsGateway {

    FakeStoreProductAPI fakeStoreProductAPI;

    public FakeStoreCartsGateway(FakeStoreProductAPI fakeStoreProductAPI) {
        this.fakeStoreProductAPI = fakeStoreProductAPI;
    }

    @Override
    public List<CartsDTO> getAllCarts() throws IOException {
        List<FakeStoreCartsResponseDTO> fakeStoreCartsDTOList = this.fakeStoreProductAPI.getAllCarts().execute()
                .body();
        if (fakeStoreCartsDTOList == null) {
            throw new IOException("Failed to fetch carts from FakeStore API");
        }

        return fakeStoreCartsDTOList.stream()
                .map(carts -> CartsDTO.builder().cartId(carts.getId()).cartProducts(carts.getProducts()).build())
                .toList();
    }

}
