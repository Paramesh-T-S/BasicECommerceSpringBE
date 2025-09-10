package com.application.ecommercecrud.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.application.ecommercecrud.Gateway.api.FakeStoreProductAPI;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Configuration
public class RetroFitConfig {

    @Bean
    public Retrofit retrofit() {
        return new Retrofit.Builder().baseUrl("https://fakestoreapi.com/")
                .addConverterFactory(GsonConverterFactory.create()).build();
    }

    @Bean
    public FakeStoreProductAPI fakeStoreProductAPI(Retrofit retrofit) {
        return retrofit.create(FakeStoreProductAPI.class);
    }

}
