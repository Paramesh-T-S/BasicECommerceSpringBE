package com.application.ecommercecrud.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FakeStoreProductsResponseDTO {

    Integer id;

    String title;

    Double price;

    String description;

    String category;

    String image;

    RatingResponseDTO rating;

}
