package com.example.moviecatalogservice.resources;

import com.example.moviecatalogservice.module.CatalogItem;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {
    @RequestMapping("/{userId}")
    public List<CatalogItem> getCatalog(@PathVariable String userId){
        //get all rated movie IDs

        //

        return Collections.singletonList(
                new CatalogItem("Transformers", "test",4)
        );
    }
}
