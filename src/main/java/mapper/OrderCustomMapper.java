package mapper;

import dto.OrderDto;
import entity.Order;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface OrderCustomMapper {
    @Mapping(source = "orderId", target = "id")
    @Mapping(source = "orderIdOwner", target = "idOwner")
    @Mapping(source = "orderCurrentCourier", target = "currentCourier")
    @Mapping(source = "orderTime", target = "time")
    @Mapping(source = "orderNewTimeAdding", target = "newTimeAdding")
    @Mapping(source = "orderExecution", target = "execution")

    Order toDomain(OrderDto dto);

    OrderDto toDTO(Order domain);

    List<Order> toDomainList(List<OrderDto> customDtoList);

    List<OrderDto> toDTOList(List<Order> list);

    Order merge(Order domain, OrderDto dto);
}
