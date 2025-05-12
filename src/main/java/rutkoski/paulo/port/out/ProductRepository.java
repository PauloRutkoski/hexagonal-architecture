package rutkoski.paulo.port.out;

import rutkoski.paulo.domain.model.Product;

public interface ProductRepository {
    Product create(Product product);
    Product findById(Long id);
}
