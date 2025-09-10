package com.application.ecommercecrud.Gateway.api;

import java.io.IOException;
import java.util.List;

import com.application.ecommercecrud.dto.FakeStoreProductsResponseDTO;

import retrofit2.Call;
import retrofit2.http.GET;

public interface FakeStoreProductAPI {

    @GET("products")
    Call<List<FakeStoreProductsResponseDTO>> getAllFakeCategories() throws IOException;

}