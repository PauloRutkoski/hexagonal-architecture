package rutkoski.paulo.domain.service;

import rutkoski.paulo.domain.model.Product;

import java.math.BigDecimal;

public class ProductValidationService {
    public boolean isValid(Product product) {
        if (product == null) {
            return false;
        } else if (product.getName() == null) {
            return false;
        } else return product.getPrice() != null && product.getPrice().compareTo(BigDecimal.ZERO) > 0;
    }
}
