package com.idiots.IdiotsShop.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Component
@ToString
public class Slipper {

    @Id
    private int articleNo;
    private String brand;
    private double price;
    private String category;

}
