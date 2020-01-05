package com.example.ratingsdataservice.resource;

import com.example.ratingsdataservice.domain.Rating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ratingsdata")
public class RatingResource {

    @RequestMapping("/{movieId}")
    public Rating getRating(@PathVariable String movieId){
        return  new Rating(movieId, 4);
    }
}
