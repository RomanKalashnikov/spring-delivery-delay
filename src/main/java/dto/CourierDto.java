package dto;

import entity.Order;
import lombok.Data;

@Data
public class CourierDto {
    private Long courierId;

    private String courierName;

    private Boolean courierOnLine;

    private Order courierOrder;
}
