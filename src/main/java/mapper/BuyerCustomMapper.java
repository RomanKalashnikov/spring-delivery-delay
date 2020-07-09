package mapper;

import dto.BuyerDto;
import entity.Buyer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface BuyerCustomMapper {
    @Mapping(source = "buyerId",target = "id")
    @Mapping(source = "buyerName",target = "name")
    @Mapping(source = "buyerPhoneNumber", target = "phoneNumber")
    @Mapping(source = "buyerAddress",target = "address")
    @Mapping(source = "buyerOrder",target = "order")

    Buyer toDomain(BuyerDto dto);

    BuyerDto toDTO(Buyer domain);

    List<Buyer> toDomainList(List<BuyerDto> customDtoList);

    List<BuyerDto> toDTOList(List<Buyer> list);

    Buyer merge(Buyer domain, BuyerDto dto);
}
