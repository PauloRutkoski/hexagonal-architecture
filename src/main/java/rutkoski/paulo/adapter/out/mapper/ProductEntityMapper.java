package rutkoski.paulo.adapter.out.mapper;

import org.mapstruct.Mapper;
import rutkoski.paulo.adapter.out.entity.ProductEntity;
import rutkoski.paulo.domain.model.Product;

@Mapper(componentModel = "spring")
public interface ProductEntityMapper {
    ProductEntity toEntity(Product product);

    Product toModel(ProductEntity product);
}
