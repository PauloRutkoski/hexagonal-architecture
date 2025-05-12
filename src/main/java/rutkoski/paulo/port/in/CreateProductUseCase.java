package rutkoski.paulo.port.in;

import rutkoski.paulo.domain.model.Product;

public interface CreateProductUseCase {
    Product createProduct(Product product);
}
