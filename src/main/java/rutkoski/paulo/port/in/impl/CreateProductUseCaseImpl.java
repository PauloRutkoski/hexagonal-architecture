package rutkoski.paulo.port.in.impl;

import lombok.AllArgsConstructor;
import rutkoski.paulo.domain.model.Product;
import rutkoski.paulo.port.in.CreateProductUseCase;
import rutkoski.paulo.port.in.GetProductByIdUseCase;
import rutkoski.paulo.port.out.ProductRepository;

@AllArgsConstructor
public class CreateProductUseCaseImpl implements CreateProductUseCase {
    private final ProductRepository productRepository;

    @Override
    public Product createProduct(Product product) {
        return productRepository.create(product);
    }
}
