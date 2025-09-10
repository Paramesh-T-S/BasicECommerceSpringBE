package com.application.ecommercecrud.configurations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.application.ecommercecrud.Gateway.api.FakeStoreProductAPI;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Configuration
public class RetroFitConfig {

    @Value("${FAKESTORE_BASE_URL}")
    private String baseUrl;

    @Bean
    public Retrofit retrofit() {
        return new Retrofit.Builder().baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create()).build();
    }

    @Bean
    public FakeStoreProductAPI fakeStoreProductAPI(Retrofit retrofit) {
        return retrofit.create(FakeStoreProductAPI.class);
    }

}
