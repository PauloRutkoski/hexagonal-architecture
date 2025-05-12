package rutkoski.paulo.adapter.in.mapper;

import org.mapstruct.Mapper;
import rutkoski.paulo.adapter.in.dto.ProductDTO;
import rutkoski.paulo.domain.model.Product;

@Mapper(componentModel = "spring")
public interface ProductDTOMapper {
    ProductDTO toDTO(Product product);

    Product toModel(ProductDTO product);
}
