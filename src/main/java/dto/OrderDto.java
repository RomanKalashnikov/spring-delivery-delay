package dto;

import entity.Buyer;
import entity.Courier;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class OrderDto {
    private Long orderId;

    private Buyer orderIdOwner;

    private Courier orderCurrentCourier;

    private LocalDateTime orderTime;

    private LocalDateTime orderNewTimeAdding;

    private Boolean orderExecution;
}
