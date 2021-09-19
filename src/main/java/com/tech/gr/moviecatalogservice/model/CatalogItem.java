package com.tech.gr.moviecatalogservice.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CatalogItem {

    private String name;
    private String desc;
    private String rating;
}
