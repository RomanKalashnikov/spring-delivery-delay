package dto;

import entity.Order;
import lombok.Data;

@Data
public class BuyerDto {
    private Long buyerId;

    private String buyerName;

    private String buyerPhoneNumber;

    private String buyerAddress;

    private Order buyerOrder;

}
