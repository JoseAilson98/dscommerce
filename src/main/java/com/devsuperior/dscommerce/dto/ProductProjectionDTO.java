package com.devsuperior.dscommerce.dto;

import com.devsuperior.dscommerce.projections.ProductProjectioMin;

public class ProductProjectionDTO {

    private Long id;
    private String name;
    private Double price;
    private String imgUrl;

    public ProductProjectionDTO() {
    }

    public ProductProjectionDTO(Long id, String name, Double price, String imgUrl) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.imgUrl = imgUrl;
    }

    public ProductProjectionDTO(ProductProjectioMin projectioMin) {
        id = projectioMin.getId();
        name = projectioMin.getName();
        price = projectioMin.getPrice();
        imgUrl = projectioMin.getImgUrl();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public String getImgUrl() {
        return imgUrl;
    }
}
