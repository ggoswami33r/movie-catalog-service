package com.tech.gr.moviecatalogservice.resources;


import com.tech.gr.moviecatalogservice.model.CatalogItem;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResources {


    @GetMapping({"/{userId}"})
    public List<CatalogItem> getCatalog(@PathVariable ("userId") String userId) {

        return Collections.singletonList(
          new CatalogItem("3 Idiots","Educational","9")
        );
    }
}