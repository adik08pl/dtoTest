package com.stempien.DtoTest;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class ProductDTO {
    @NotBlank(message = "Wartość nazwy produktu nie może być pusta.")
    @Size(min = 3, max = 100, message = "Długość nazwy produktu ma mieć min 3 i max 100 znaków.")
    private String productName;
    @Min(value = 0,message = "Cena musi być dodatnia.")
    private Double price;
    @NotBlank(message = "Kategoria nie może być pusta")
    private String category;
    @Min(value = 0, message = "Stan magazynów musi być watrością większą lub równą 0")
    private Integer stockQuantity;
}
