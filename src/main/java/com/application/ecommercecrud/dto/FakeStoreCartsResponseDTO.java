package com.application.ecommercecrud.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FakeStoreCartsResponseDTO {

    Integer id;

    Integer userId;

    String date;

    List<cartProductsDTO> products;

}
