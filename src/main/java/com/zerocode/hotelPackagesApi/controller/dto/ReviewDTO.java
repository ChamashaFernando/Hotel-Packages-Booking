package com.zerocode.hotelPackagesApi.controller.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ReviewDTO {
    private Long id;
    private int rating;
    private String comment;
    private LocalDateTime postedDateAndTime;

}
