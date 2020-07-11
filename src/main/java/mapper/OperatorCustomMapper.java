package mapper;

import dto.OperatorDto;
import entity.Operator;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface OperatorCustomMapper {
    @Mapping(source = "operatorId", target = "id")
    @Mapping(source = "operatorOnLine", target = "onLine")

    Operator toDomain(OperatorDto dto);

    OperatorDto toDTO(Operator domain);

    List<Operator> toDomainList(List<OperatorDto> customDtoList);

    List<OperatorDto> toDTOList(List<Operator> list);

    Operator merge(Operator domain, OperatorDto dto);
}
