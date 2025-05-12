package rutkoski.paulo.port.in.impl;

import lombok.AllArgsConstructor;
import rutkoski.paulo.domain.model.Product;
import rutkoski.paulo.port.in.CreateProductUseCase;
import rutkoski.paulo.port.in.GetProductByIdUseCase;
import rutkoski.paulo.port.out.ProductRepository;

@AllArgsConstructor
public class GetProductByIdUseCaseImpl implements GetProductByIdUseCase {
    private final ProductRepository productRepository;

    @Override
    public Product getProductById(Long id) {
        return productRepository.findById(id);
    }
}
