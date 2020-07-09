package mapper;

import dto.CourierDto;
import entity.Courier;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CourierCustomMapper {
    @Mapping(source = "courierId", target = "id")
    @Mapping(source = "courierName", target = "name")
    @Mapping(source = "courierOnLine", target = "onLine")
    @Mapping(source = "courierOrder", target = "order")

    Courier toDomain(CourierDto dto);

    CourierDto toDTO(Courier domain);

    List<Courier> toDomainList(List<CourierDto> customDtoList);

    List<CourierDto> toDTOList(List<Courier> list);

    Courier merge(Courier domain, CourierDto dto);
}
