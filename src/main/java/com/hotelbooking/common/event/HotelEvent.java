package com.hotelbooking.common.event;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class HotelEvent {
    private UUID hotelId;
    private String name;
    private String city;
    private Double rating;
}
