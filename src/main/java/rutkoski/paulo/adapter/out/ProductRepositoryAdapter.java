package rutkoski.paulo.adapter.out;

import lombok.RequiredArgsConstructor;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;
import rutkoski.paulo.adapter.out.entity.ProductEntity;
import rutkoski.paulo.adapter.out.jpa.ProductJPARepository;
import rutkoski.paulo.adapter.out.mapper.ProductEntityMapper;
import rutkoski.paulo.domain.model.Product;
import rutkoski.paulo.port.out.ProductRepository;

@Component
@RequiredArgsConstructor
public class ProductRepositoryAdapter implements ProductRepository {
    private final ProductJPARepository productJPARepository;
    private final ProductEntityMapper productEntityMapper = Mappers.getMapper(ProductEntityMapper.class);

    @Override
    public Product create(Product product) {
        ProductEntity entity = productJPARepository.save(
                productEntityMapper.toEntity(product)
        );
        return productEntityMapper.toModel(entity);
    }

    @Override
    public Product findById(Long id) {
        return productEntityMapper.toModel(
                productJPARepository.getReferenceById(id)
        );
    }
}
