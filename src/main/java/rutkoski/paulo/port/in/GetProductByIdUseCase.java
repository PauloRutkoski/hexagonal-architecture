package rutkoski.paulo.port.in;

import rutkoski.paulo.domain.model.Product;

public interface GetProductByIdUseCase {
    Product getProductById(Long id);
}
