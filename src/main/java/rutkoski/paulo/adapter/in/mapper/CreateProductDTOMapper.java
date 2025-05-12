package rutkoski.paulo.adapter.in.mapper;

import org.mapstruct.Mapper;
import rutkoski.paulo.adapter.in.dto.CreateProductDTO;
import rutkoski.paulo.adapter.in.dto.ProductDTO;
import rutkoski.paulo.domain.model.Product;

@Mapper(componentModel = "spring")
public interface CreateProductDTOMapper {
    CreateProductDTO toDTO(Product product);

    Product toModel(CreateProductDTO product);
}
