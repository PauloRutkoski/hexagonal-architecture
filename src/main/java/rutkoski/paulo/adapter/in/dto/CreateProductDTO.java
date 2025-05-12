package rutkoski.paulo.adapter.in.dto;

import java.math.BigDecimal;

public record CreateProductDTO(String name, String description, BigDecimal price) {
}
