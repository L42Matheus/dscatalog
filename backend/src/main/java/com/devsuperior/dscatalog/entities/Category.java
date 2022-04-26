package com.devsuperior.dscatalog.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class Category implements Serializable {

    private Long id;
    private String name;


}
