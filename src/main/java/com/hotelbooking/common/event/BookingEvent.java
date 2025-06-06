package com.hotelbooking.common.event;
import lombok.*;
import java.time.LocalDate;
import java.util.UUID;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class BookingEvent {
    private UUID bookingId;
    private String userId;
    private UUID roomId;
    private LocalDate checkIn;
    private LocalDate checkOut;
    private String status;
}